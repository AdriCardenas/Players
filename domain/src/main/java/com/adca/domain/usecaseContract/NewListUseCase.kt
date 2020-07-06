package com.adca.domain.usecaseContract

import com.adca.domain.model.ListEntity

interface NewListUseCase {
    suspend fun invoke(list:ListEntity)
}