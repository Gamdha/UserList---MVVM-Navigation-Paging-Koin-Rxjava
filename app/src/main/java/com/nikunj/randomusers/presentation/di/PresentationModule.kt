package com.nikunj.randomusers.presentation.di

import com.nikunj.randomusers.presentation.ui.favorites.FavoriteUsersViewModel
import com.nikunj.randomusers.presentation.ui.settings.SettingsViewModel
import com.nikunj.randomusers.presentation.ui.userdetail.UserDetailViewModel
import com.nikunj.randomusers.presentation.ui.users.UsersViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel { UsersViewModel(get()) }
    viewModel { UserDetailViewModel(get()) }
    viewModel { FavoriteUsersViewModel(get(), get()) }
    viewModel { SettingsViewModel(get()) }
}