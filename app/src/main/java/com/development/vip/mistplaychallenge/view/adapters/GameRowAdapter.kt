package com.development.vip.mistplaychallenge.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.development.vip.mistplaychallenge.R
import com.development.vip.mistplaychallenge.model.GameEntity
import com.development.vip.mistplaychallenge.view.viewHolders.GameViewHolder

class GameRowAdapter(private val gameList: List<GameEntity> = emptyList()) : RecyclerView.Adapter<GameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        GameViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.game_item, parent, false))

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) = holder.bind(gameList[position])

    override fun getItemCount(): Int = gameList.size
}