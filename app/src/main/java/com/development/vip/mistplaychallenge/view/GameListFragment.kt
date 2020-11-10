package com.development.vip.mistplaychallenge.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.development.vip.mistplaychallenge.R
import com.development.vip.mistplaychallenge.model.GameSectionEntity
import com.development.vip.mistplaychallenge.repository.GameRepositoryImpl
import com.development.vip.mistplaychallenge.view.adapters.GameSectionAdapter
import com.development.vip.mistplaychallenge.viewmodel.GameListViewModel
import com.development.vip.mistplaychallenge.viewmodel.GameViewModelFactory
import kotlinx.android.synthetic.main.fragment_game_list.*

class GameListFragment : Fragment() {

    companion object {
        private const val ASSET_NAME = "games.json"
    }

    private val viewModel: GameListViewModel by viewModels {
        GameViewModelFactory(GameRepositoryImpl(readAssets()))
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        inflater.inflate(R.layout.fragment_game_list, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.gameListData.observe(viewLifecycleOwner) {
            setupGameListView(it)
        }
    }

    private fun setupGameListView(sectionList: List<GameSectionEntity>) = with(gameListView) {
        adapter = GameSectionAdapter(sectionList) {
            findNavController().navigate(R.id.gameDetailsDest,
                bundleOf(GameDetailsFragment.GAME_EXTRA to it))
        }
        hasFixedSize()
    }

    private fun readAssets(): String =
        context?.assets?.open(ASSET_NAME)?.bufferedReader().use { it?.readText() } ?: ""
}