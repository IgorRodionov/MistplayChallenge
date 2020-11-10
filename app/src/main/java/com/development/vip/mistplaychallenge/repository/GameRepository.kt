package com.development.vip.mistplaychallenge.repository

import com.development.vip.mistplaychallenge.model.GameSectionEntity

interface GameRepository {
    suspend fun fetchGameList(): List<GameSectionEntity>
}