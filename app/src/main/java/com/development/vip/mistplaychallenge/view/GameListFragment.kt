package com.development.vip.mistplaychallenge.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.development.vip.mistplaychallenge.R
import com.development.vip.mistplaychallenge.repository.GameRepositoryImpl
import com.development.vip.mistplaychallenge.viewmodel.GameListViewModel
import com.development.vip.mistplaychallenge.viewmodel.GameViewModelFactory

class GameListFragment : Fragment() {

    companion object {
        private const val ASSET_NAME = "games.json"
    }

    private val viewModel: GameListViewModel by viewModels {
        GameViewModelFactory(GameRepositoryImpl(readAssets()))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.fragment_game_list, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.gameListData.observe(viewLifecycleOwner) {
            val t = it
        }
    }

    private fun readAssets(): String =
        context?.assets?.open(ASSET_NAME)?.bufferedReader().use { it?.readText() } ?: ""
}