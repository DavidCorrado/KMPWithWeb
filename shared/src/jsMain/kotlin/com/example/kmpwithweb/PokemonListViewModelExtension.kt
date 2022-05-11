package com.example.kmpwithweb

import com.example.kmpwithweb.data.Pokemon
import com.example.kmpwithweb.pokemonList.PokemonListViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.promise
import kotlin.js.JsExport
import kotlin.js.Promise

@JsExport
fun PokemonListViewModel.getListAsync(): Promise<Array<Pokemon>> =
    GlobalScope.promise { PokemonListViewModel().getList().toTypedArray() }