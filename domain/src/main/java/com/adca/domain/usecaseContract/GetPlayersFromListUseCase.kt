package com.adca.domain.usecaseContract

import com.adca.domain.model.PlayerEntity

interface GetPlayersFromListUseCase {
    suspend fun invoke(id:String): List<PlayerEntity>
}