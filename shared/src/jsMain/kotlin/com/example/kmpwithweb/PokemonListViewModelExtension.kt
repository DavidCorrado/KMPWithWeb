package com.example.kmpwithweb

import com.example.kmpwithweb.data.Pokemon
import com.example.kmpwithweb.pokemonList.PokemonListViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.promise
import kotlin.js.JsExport
import kotlin.js.Promise

//TODO there a way to get this automatically generated
//TODO why do we need to create PokemonListViewModel in the below method rather than using getList directly
//TODO I imagine we should be using flows or something like that.  Something to explore
//TODO is there a good complex example of how to do this on github to use a references
//TODO what data types are limited and what is a good best practice to use to avoid issues
@JsExport
fun PokemonListViewModel.getListAsync(): Promise<Array<Pokemon>> =
    GlobalScope.promise { PokemonListViewModel().getList().toTypedArray() }