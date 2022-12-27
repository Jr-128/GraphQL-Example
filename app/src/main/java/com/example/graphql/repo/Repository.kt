package com.example.graphql.repo

import com.apollographql.apollo.api.Response
import com.example.graphql.network.NetworkApi


interface Repository {
    suspend fun queryCharactersList()
}

class RepositoryImpl : Repository {

    private lateinit var networkApi: NetworkApi

    override suspend fun queryCharactersList() {
        TODO("Not yet implemented")
    }

}
