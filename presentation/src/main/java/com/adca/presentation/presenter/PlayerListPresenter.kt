package com.adca.presentation.presenter

import com.adca.domain.model.PlayerEntity
import com.adca.domain.usecaseContract.GetPlayersContract
import com.adca.domain.usecaseContract.SavePlayerContract
import com.adca.presentation.contract.PlayerListContract
import com.adca.presentation.mapper.transform
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class PlayerListPresenter(
    private val getPlayersUseCase: GetPlayersContract,
    private val savePlayerUseCase: SavePlayerContract,
    private val view: PlayerListContract.View
) : PlayerListContract.Presenter, CoroutineScope {

    private val job = Job()

    override val coroutineContext: CoroutineContext = Dispatchers.Main + job

    override fun loadItems() {
        launch {
            view.setListItems(transform(getPlayersUseCase.getPlayers()))
        }
    }

    override fun addNewPlayer(name: String) {
        launch {
            savePlayerUseCase.savePlayer(PlayerEntity(name = name))
            view.setListItems(transform(getPlayersUseCase.getPlayers()))
        }
    }

    override fun cleanup() {
        job.cancel()
    }
}