package com.joao.santana.data.repositories

import com.joao.santana.data.models.SessionRequestBody
import com.joao.santana.data.sources.remote.TokenService
import com.joao.santana.data.sources.remote.SessionService
import com.joao.santana.domain.repositories.AuthenticationRepository

internal class AuthenticationRepositoryImpl(
    private val tokenService: TokenService,
    private val sessionService: SessionService
) : AuthenticationRepository {

    override suspend fun createRequestToken(apiKey: String) {
        tokenService.createRequestTokenAsync(apiKey)
            .await()
    }

    override suspend fun createSession(apiKey: String, requestToken: String) {
        sessionService.createSessionAsync(apiKey, SessionRequestBody(requestToken))
            .await()
    }
}