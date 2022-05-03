package com.example.kmpwithweb.android

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.kmpwithweb.pokemonList.PokemonListViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv: TextView = findViewById(R.id.text_view)
        lifecycleScope.launchWhenStarted {
            tv.text = PokemonListViewModel().getList().joinToString { it.name }
        }
    }
}
