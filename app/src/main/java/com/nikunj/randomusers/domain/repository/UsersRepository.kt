package com.nikunj.randomusers.domain.repository

import androidx.paging.PagedList
import com.nikunj.randomusers.domain.models.User
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single

interface UsersRepository {
    fun getUserList(): Observable<PagedList<User>>
    fun getFavoriteUserList(): Single<List<User>>
    fun updateUser(user: User): Completable
    fun deleteLocalUsers(): Completable
}