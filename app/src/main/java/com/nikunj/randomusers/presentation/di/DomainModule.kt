package com.nikunj.randomusers.presentation.di

import com.nikunj.randomusers.domain.usecase.DeleteLocalUsersUseCase
import com.nikunj.randomusers.domain.usecase.GetFavoriteUserListUseCase
import com.nikunj.randomusers.domain.usecase.GetUserListUseCase
import com.nikunj.randomusers.domain.usecase.UpdateUserUseCase
import org.koin.dsl.module

val domainModule = module {
    single { GetUserListUseCase(get()) }
    single { GetFavoriteUserListUseCase(get()) }
    single { UpdateUserUseCase(get()) }
    single { DeleteLocalUsersUseCase(get()) }
}