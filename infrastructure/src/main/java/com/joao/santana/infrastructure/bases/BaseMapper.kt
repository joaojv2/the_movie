package com.joao.santana.infrastructure.bases

abstract class BaseMapper<Input, Output> {

    abstract fun map(input: Input): Output
}