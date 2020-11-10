package com.development.vip.mistplaychallenge.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.development.vip.mistplaychallenge.repository.GameRepository

class GameListViewModel(private val repository: GameRepository): ViewModel() {

    val gameListData = liveData {
        emit(repository.fetchGameList())
    }
}