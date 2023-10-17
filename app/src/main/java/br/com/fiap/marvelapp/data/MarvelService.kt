package br.com.fiap.marvelapp.data

import br.com.fiap.marvelapp.domain.MarvelCharacterDataModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import java.sql.Timestamp
import java.time.ZoneOffset

interface MarvelService {

    @GET("/v1/public/characters")
    suspend fun listCharacters(
        @Query("timestamp") timestamp: String,
        @Query("apikey") apiKey: String,
        @Query("hash") hash: String,
        @Query("offset") offset: Int = 1241
    ) : Response<MarvelCharacterDataModel>
}