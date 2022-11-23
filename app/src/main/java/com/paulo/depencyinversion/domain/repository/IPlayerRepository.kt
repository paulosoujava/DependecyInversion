package com.paulo.depencyinversion.domain.repository

import com.paulo.depencyinversion.domain.entity.Player

interface IPlayerRepository {
    fun addPlayer(player: Player)
}