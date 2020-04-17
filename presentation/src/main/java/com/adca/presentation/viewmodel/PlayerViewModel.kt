package com.adca.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adca.domain.model.PlayerEntity
import com.adca.domain.usecaseContract.GetPlayersContract
import com.adca.domain.usecaseContract.SavePlayerContract
import com.adca.presentation.mapper.transform
import com.adca.presentation.model.PlayerView

class PlayerViewModel(
    private val getPlayersUseCase: GetPlayersContract,
    private val savePlayerUseCase: SavePlayerContract
) : ViewModel() {

    val playersDisplayed = MutableLiveData<List<PlayerView>>()

    fun loadPlayers() {
        playersDisplayed.value =
            transform(getPlayersUseCase.getPlayers())
    }

    fun savePlayer(name: String) {
        val itemNumber = playersDisplayed.value?.size ?: 0
        savePlayerUseCase.savePlayer(
            PlayerEntity(
                itemNumber,
                name
            )
        )
        loadPlayers()
    }
}