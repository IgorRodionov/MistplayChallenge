package com.development.vip.mistplaychallenge.view.viewHolders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.development.vip.mistplaychallenge.model.GameEntity
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.game_item.view.*

class GameViewHolder(override val containerView: View): RecyclerView.ViewHolder(containerView), LayoutContainer {

    fun bind(entity: GameEntity) {
        containerView.titleView.text = entity.title
        Glide.with(containerView).load(entity.image).into(containerView.gameCoverView)
    }
}