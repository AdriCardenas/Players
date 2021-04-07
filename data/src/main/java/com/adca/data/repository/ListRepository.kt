package com.adca.data.repository

import com.adca.data.source.PersistanceSource
import com.adca.domain.contract.ListRepositoryContract
import com.adca.domain.model.ListPlayers

class ListRepository(private val dataSource: PersistanceSource) : ListRepositoryContract {

    override suspend fun saveNewList(list: ListPlayers) {
        dataSource.saveNewList(list)
    }

}