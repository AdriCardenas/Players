package com.adca.presentation.mapper

import com.adca.domain.model.PlayerEntity
import com.adca.presentation.model.PlayerView

fun transform(list: List<PlayerEntity>): List<PlayerView> {
    return list.map { playerEntity ->
        transform(
            playerEntity
        )
    }
}

fun transform(playerEntity: PlayerEntity): PlayerView {
    return PlayerView(
        id = playerEntity.id,
        name = playerEntity.name
    )
}
