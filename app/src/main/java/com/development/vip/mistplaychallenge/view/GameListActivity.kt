package com.development.vip.mistplaychallenge.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.development.vip.mistplaychallenge.R

class GameListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_list)
        setupActionBarWithNavController(findNavController(R.id.gameListNavHost))
    }
}