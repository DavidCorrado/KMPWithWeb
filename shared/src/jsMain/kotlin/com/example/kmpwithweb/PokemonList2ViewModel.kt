@file:JsExport

package com.example.kmpwithweb

import com.example.kmpwithweb.data.Pokemon
import com.example.kmpwithweb.pokemonList.PokemonListViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.promise
import kotlin.js.Promise

class PokemonList2ViewModel {
    private val pokemonListViewModel = PokemonListViewModel()

    fun getListAsync(): Promise<Array<Pokemon>> = GlobalScope.promise {
        getList()
        //pokemonListViewModel.getList().toTypedArray()
    }

    private fun getList(): Array<Pokemon> {
        return arrayOf(Pokemon("David"))
    }
}