package com.nikunj.randomusers.domain.usecase

import com.nikunj.randomusers.domain.repository.UsersRepository
import com.nikunj.randomusers.domain.base.SingleUseCase
import com.nikunj.randomusers.domain.models.User
import io.reactivex.Single

class GetFavoriteUserListUseCase(private val usersRepository: UsersRepository): SingleUseCase<List<User>, Unit>() {

    override fun useCaseExecution(params: Unit): Single<List<User>> = usersRepository.getFavoriteUserList()
}