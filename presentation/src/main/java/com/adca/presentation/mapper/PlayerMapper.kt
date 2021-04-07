package com.adca.presentation.mapper

import com.adca.domain.model.Player
import com.adca.presentation.model.PlayerView

fun transform(list: List<Player>): List<PlayerView> {
    return list.map { playerEntity ->
        transform(
            playerEntity
        )
    }
}

fun transform(player:Player): PlayerView {
    return PlayerView(
        id = player.id,
        name = player.name
    )
}
