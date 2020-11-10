package com.development.vip.mistplaychallenge.repository

import com.development.vip.mistplaychallenge.model.GameListEntity

interface GameRepository {
    suspend fun fetchGameList(): List<GameListEntity>
}