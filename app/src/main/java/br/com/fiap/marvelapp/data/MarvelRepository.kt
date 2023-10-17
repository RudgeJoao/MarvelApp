package br.com.fiap.marvelapp.data

import br.com.fiap.marvelapp.domain.MarvelCharacterDataModel
import retrofit2.Response
import retrofit2.http.Query

interface MarvelRepository {
    suspend fun listCharacters(
        timestamp: String,
        apiKey: String,
        hash: String,
        offset: Int = 1241
    ): Response<MarvelCharacterDataModel>
}

class MarvelRepositoryImpl (private val service: MarvelService) : MarvelRepository{
    override suspend fun listCharacters(
        timestamp: String,
        apiKey: String,
        hash: String,
        offset: Int
    ): Response<MarvelCharacterDataModel> {
        return service.listCharacters(
            timestamp,
            apiKey,
            hash,
            offset
        )
    }


}