package com.development.vip.mistplaychallenge.repository

import com.development.vip.mistplaychallenge.model.GameSectionEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class GameRepositoryImpl(private val json: String) : GameRepository {

    private val type = object : TypeToken<List<GameSectionEntity>>() {}.type

    override suspend fun fetchGameList(): List<GameSectionEntity> = Gson().fromJson(json, type)
}