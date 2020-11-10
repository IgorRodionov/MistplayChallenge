package com.development.vip.mistplaychallenge.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GameEntity(
    @SerializedName("title")
    val title: String,
    @SerializedName("img")
    val image: String): Parcelable