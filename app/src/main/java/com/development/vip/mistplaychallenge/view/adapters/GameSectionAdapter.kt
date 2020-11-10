package com.development.vip.mistplaychallenge.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.development.vip.mistplaychallenge.R
import com.development.vip.mistplaychallenge.model.GameSectionEntity
import com.development.vip.mistplaychallenge.view.viewHolders.GameSectionViewHolder

class GameSectionAdapter(private val sections: List<GameSectionEntity> = emptyList()): RecyclerView.Adapter<GameSectionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        GameSectionViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.game_section_item, parent, false))

    override fun onBindViewHolder(holder: GameSectionViewHolder, position: Int) = holder.bind(sections[position])

    override fun getItemCount(): Int = sections.size
}