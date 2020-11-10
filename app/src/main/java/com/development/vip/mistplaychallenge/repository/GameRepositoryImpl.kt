package com.development.vip.mistplaychallenge.repository

import com.development.vip.mistplaychallenge.model.GameListEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class GameRepositoryImpl(private val json: String) : GameRepository {

    private val type = object : TypeToken<List<GameListEntity>>() {}.type

    override suspend fun fetchGameList(): List<GameListEntity> = Gson().fromJson(json, type)
}