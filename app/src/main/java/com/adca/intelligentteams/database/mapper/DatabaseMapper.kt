package com.adca.intelligentteams.database.mapper

import com.adca.domain.model.ListPlayers
import com.adca.domain.model.Player
import com.adca.domain.model.Skill
import com.adca.intelligentteams.database.model.ListPlayersEntity
import com.adca.intelligentteams.database.model.PlayerEntity
import com.adca.intelligentteams.database.model.SkillEntity

fun ListPlayersEntity.toListPlayer(): ListPlayers = ListPlayers(id, name)
fun ListPlayers.toPlayerEntity(): ListPlayersEntity = ListPlayersEntity(id, name)
fun PlayerEntity.toPlayer(): Player = Player(id, name, skill.toSkill(), listId)
fun Player.toPlayerEntity(): PlayerEntity =
    PlayerEntity(name = name, skill = skill.toSkillEntity(), listId = listId)
fun Player.toPlayerEntityWithId(): PlayerEntity =
    PlayerEntity(id = id, name = name, skill = skill.toSkillEntity(), listId = listId)

fun Skill.toSkillEntity(): SkillEntity = SkillEntity(level)
fun SkillEntity.toSkill(): Skill = Skill(level)

fun transform(list: List<PlayerEntity>): List<Player> {
    return list.map { playerEntity -> playerEntity.toPlayer() }
}
