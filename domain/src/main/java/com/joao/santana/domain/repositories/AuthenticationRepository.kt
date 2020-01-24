package com.joao.santana.domain.repositories

interface AuthenticationRepository {

    suspend fun createRequestToken(apiKey: String)

    suspend fun createSession(apiKey: String, requestToken: String)
}