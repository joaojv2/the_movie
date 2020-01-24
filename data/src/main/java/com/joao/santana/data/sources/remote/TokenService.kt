package com.joao.santana.data.sources.remote

import com.joao.santana.data.models.TokenResponseBody
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

internal interface TokenService {

    @GET(value = "/authentication/token/new")
    suspend fun createRequestTokenAsync(
        @Path(value = "api_key") apiKey: String
    ): Deferred<Response<TokenResponseBody>>
}