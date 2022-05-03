package com.example.kmpwithweb.pokemonList

import com.example.kmpwithweb.SharedViewModel
import com.example.kmpwithweb.data.Pokemon
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class PokemonListViewModel : SharedViewModel() {
    private val client = HttpClient() {
        install(ContentNegotiation) {
            json(
                Json {
                    ignoreUnknownKeys = true
                },
                ContentType.Any
            )
        }
    }

    suspend fun getList(): List<Pokemon> {
        return client.get("https://gist.githubusercontent.com/DavidCorrado/8912aa29d7c4a5fbf03993b32916d601/raw/681ef0b793ab444f2d81f04f605037fb44814125/pokemon.json")
            .body()
    }
}

