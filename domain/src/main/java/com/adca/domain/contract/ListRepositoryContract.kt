package com.adca.domain.contract

import com.adca.domain.model.ListPlayers

interface ListRepositoryContract {

    suspend fun saveNewList (list: ListPlayers)

}