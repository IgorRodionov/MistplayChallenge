package com.development.vip.mistplaychallenge.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.development.vip.mistplaychallenge.R
import com.development.vip.mistplaychallenge.model.GameEntity
import kotlinx.android.synthetic.main.fragment_game_details.*

class GameDetailsFragment: Fragment() {

    companion object {
        const val GAME_EXTRA = "game_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        findNavController().popBackStack()
        return true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.fragment_game_details, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.getParcelable<GameEntity>(GAME_EXTRA)?.let {
            titleView.text = it.title
            Glide.with(this).load(it.image).into(gameCoverFullView)
        }
    }
}