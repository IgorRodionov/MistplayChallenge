package com.development.vip.mistplaychallenge.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.development.vip.mistplaychallenge.repository.GameRepository
import java.lang.IllegalArgumentException

class GameViewModelFactory(private val repository: GameRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GameListViewModel::class.java)) return GameListViewModel(repository) as T
        throw IllegalArgumentException()
    }
}