package com.nikunj.randomusers.domain.usecase

import com.nikunj.randomusers.domain.repository.UsersRepository
import com.nikunj.randomusers.domain.base.CompletableUseCase
import com.nikunj.randomusers.domain.models.User
import io.reactivex.Completable

class UpdateUserUseCase(private val usersRepository: UsersRepository): CompletableUseCase<Unit, User>() {

    override fun useCaseExecution(params: User): Completable = usersRepository.updateUser(params)
}