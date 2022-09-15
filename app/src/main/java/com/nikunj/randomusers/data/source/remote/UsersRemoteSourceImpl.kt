package com.nikunj.randomusers.data.source.remote

import com.nikunj.randomusers.data.mapper.mapRemoteUserToDomain
import com.nikunj.randomusers.data.source.remote.retrofit.UsersService
import com.nikunj.randomusers.domain.models.User
import io.reactivex.Single

class UsersRemoteSourceImpl(private val usersService: UsersService): UsersRemoteSource {

    override fun getUsersFromApi(page: Int): Single<List<User>> = usersService.getUsers(page)
        .map { ApiResponse ->
            ApiResponse.results.map(mapRemoteUserToDomain)
        }
}