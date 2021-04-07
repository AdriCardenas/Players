package com.adca.domain.usecaseContract

import com.adca.domain.model.Player

interface GetPlayersFromListUseCase {
    suspend fun invoke(id:String): List<Player>
}