package com.joao.santana.data.sources.remote

internal interface RequestTokenService {

    suspend fun createRequestToken()
}