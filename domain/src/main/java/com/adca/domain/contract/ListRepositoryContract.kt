package com.adca.domain.contract

import com.adca.domain.model.ListEntity

interface ListRepositoryContract {

    suspend fun saveNewList (list: ListEntity)

}