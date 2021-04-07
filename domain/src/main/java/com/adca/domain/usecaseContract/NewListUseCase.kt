package com.adca.domain.usecaseContract

import com.adca.domain.model.ListPlayers


interface NewListUseCase {
    suspend fun invoke(list: ListPlayers)
}