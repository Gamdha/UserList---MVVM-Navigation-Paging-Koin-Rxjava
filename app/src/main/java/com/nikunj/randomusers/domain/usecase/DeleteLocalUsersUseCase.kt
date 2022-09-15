package com.nikunj.randomusers.domain.usecase

import com.nikunj.randomusers.domain.repository.UsersRepository
import com.nikunj.randomusers.domain.base.CompletableUseCase
import io.reactivex.Completable

class DeleteLocalUsersUseCase(private val usersRepository: UsersRepository): CompletableUseCase<Unit, Unit>() {

    override fun useCaseExecution(params: Unit): Completable = usersRepository.deleteLocalUsers()
}