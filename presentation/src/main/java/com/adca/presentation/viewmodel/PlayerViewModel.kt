package com.adca.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adca.domain.model.PlayerEntity
import com.adca.domain.usecaseContract.GetPlayersFromListUseCase
import com.adca.domain.usecaseContract.SavePlayerUseCase
import com.adca.presentation.mapper.transform
import com.adca.presentation.model.PlayerView
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class PlayerViewModel(
    private val getPlayersFromListUseCase: GetPlayersFromListUseCase,
    private val savePlayerUseCase: SavePlayerUseCase
) : ViewModel(), CoroutineScope {

    val playersDisplayed = MutableLiveData<List<PlayerView>>()

    private val job = Job()

    // Define default thread for Coroutine as Main and add job
    override val coroutineContext: CoroutineContext = Dispatchers.Main + job

    fun loadPlayers() {
        launch {
            getPlayers()
        }
    }

    private suspend fun getPlayers() {
        playersDisplayed.value =
            transform(getPlayersFromListUseCase.invoke(""))
    }

    fun savePlayer(name: String) {
        val itemNumber = playersDisplayed.value?.size ?: 0
        launch {
            withContext(Dispatchers.IO) {
                savePlayerUseCase.invoke(
                    PlayerEntity(
                        name = name,
                        listId = "1"
                    )
                )
            }
            getPlayers()
        }
    }
}