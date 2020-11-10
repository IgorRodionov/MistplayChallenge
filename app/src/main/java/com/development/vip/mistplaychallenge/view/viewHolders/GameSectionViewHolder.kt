package com.development.vip.mistplaychallenge.view.viewHolders

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.development.vip.mistplaychallenge.model.GameEntity
import com.development.vip.mistplaychallenge.model.GameSectionEntity
import com.development.vip.mistplaychallenge.view.adapters.GameRowAdapter
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.game_section_item.view.*

class GameSectionViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {

    fun bind(entity: GameSectionEntity) {
        containerView.sectionTitleView.text = entity.title
        setupRowView(entity.gameList)
    }

    private fun setupRowView(gameList: List<GameEntity>) = with(containerView.gameRowView) {
        adapter = GameRowAdapter(gameList)
        layoutManager = LinearLayoutManager(containerView.context, LinearLayoutManager.HORIZONTAL, false)
        hasFixedSize()
    }
}