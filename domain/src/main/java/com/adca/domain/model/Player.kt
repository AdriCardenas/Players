package com.adca.domain.model

data class Player(
    val id: Int = 0,
    val name: String,
    val skill: Skill = Skill(),
    val listId: Int
)