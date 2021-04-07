package com.adca.domain.usecases

import com.adca.domain.contract.ListRepositoryContract
import com.adca.domain.model.ListEntity
import com.adca.domain.usecaseContract.NewListUseCase

class NewListUseCaseImpl(private val repository: ListRepositoryContract) : NewListUseCase {
    override suspend fun invoke(list: ListEntity) {
        repository.saveNewList(list)
    }
}