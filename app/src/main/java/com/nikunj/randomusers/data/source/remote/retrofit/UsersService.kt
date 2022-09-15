package com.nikunj.randomusers.data.source.remote.retrofit

import com.nikunj.randomusers.data.constants.RepositoryConstants.DEFAULT_PAGE
import com.nikunj.randomusers.data.constants.RepositoryConstants.DEFAULT_PAGE_SIZE
import com.nikunj.randomusers.data.constants.RepositoryConstants.DEFAULT_SEED
import com.nikunj.randomusers.data.source.remote.dto.ResponseDto
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface UsersService {

    @GET(" ")
    fun getUsers(
        @Query("page") page: Int = DEFAULT_PAGE,
        @Query("results") results: Int = DEFAULT_PAGE_SIZE,
        @Query("seed") seed: Int = DEFAULT_SEED
    ): Single<ResponseDto>
}