package com.adca.domain.usecases

import com.adca.domain.model.PlayerEntity
import com.adca.domain.repository.contract.PlayerRepositoryContract
import com.adca.domain.usecaseContract.SavePlayerContract

class SavePlayer(private val repository: PlayerRepositoryContract) :SavePlayerContract{
    override fun savePlayer(player: PlayerEntity) = repository.saveNewPlayer(player)
}
