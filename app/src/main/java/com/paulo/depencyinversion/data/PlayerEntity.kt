package com.paulo.depencyinversion.data

import com.paulo.depencyinversion.domain.entity.Player

data class PlayerEntity(
    val name: String
)

fun Player.mapToPlayerEntity(): PlayerEntity{
    return PlayerEntity(name)
}