package com.nikunj.randomusers.data.source.remote

import com.nikunj.randomusers.domain.models.User
import io.reactivex.Single

interface UsersRemoteSource {
    fun getUsersFromApi(page: Int): Single<List<User>>
}