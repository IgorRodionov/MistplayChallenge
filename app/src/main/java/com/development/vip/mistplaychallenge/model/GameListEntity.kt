package com.development.vip.mistplaychallenge.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GameListEntity(
    @SerializedName("list_title")
    val title: String,
    @SerializedName("games")
    val gameList: List<GameEntity>) : Parcelable