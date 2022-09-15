package com.nikunj.randomusers.data.repository

import androidx.paging.PagedList
import androidx.paging.RxPagedListBuilder
import com.nikunj.randomusers.data.mapper.mapDomainUserToLocal
import com.nikunj.randomusers.data.source.local.UsersLocalSource
import com.nikunj.randomusers.domain.models.User
import com.nikunj.randomusers.domain.repository.UsersRepository
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single

class UsersRepositoryImpl(
    private val usersLocalSource: UsersLocalSource,
    private val pagedListBuilder: RxPagedListBuilder<Int, User>
): UsersRepository {

    override fun getUserList(): Observable<PagedList<User>> = pagedListBuilder.buildObservable()

    override fun getFavoriteUserList(): Single<List<User>> = usersLocalSource.getFavoriteUsersFromDatabase()

    override fun updateUser(user: User): Completable = usersLocalSource.updateUser(mapDomainUserToLocal(user))

    override fun deleteLocalUsers(): Completable = usersLocalSource.deleteLocalUsers()
}