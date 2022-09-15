package com.nikunj.randomusers.domain.usecase

import androidx.paging.PagedList
import com.nikunj.randomusers.domain.base.ObservableUseCase
import com.nikunj.randomusers.domain.models.User
import com.nikunj.randomusers.domain.repository.UsersRepository
import io.reactivex.Observable

class GetUserListUseCase(private val usersRepository: UsersRepository): ObservableUseCase<PagedList<User>, Unit>() {

    override fun useCaseExecution(params: Unit): Observable<PagedList<User>> = usersRepository.getUserList()
}