package com.joao.santana.data.sources.remote

import com.joao.santana.data.models.SessionRequestBody
import com.joao.santana.data.models.SessionResponseBody
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path

internal interface SessionService {

    @POST(value = "/authentication/session/new")
    suspend fun createSessionAsync(
        @Path(value = "api_key") apiKey: String,
        @Body sessionRequestBody: SessionRequestBody
    ): Deferred<Response<SessionResponseBody>>
}