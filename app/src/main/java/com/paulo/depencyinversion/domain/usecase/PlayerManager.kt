package com.paulo.depencyinversion.domain.usecase

import com.paulo.depencyinversion.domain.entity.Player
import com.paulo.depencyinversion.domain.repository.IPlayerRepository

class PlayerManager(
    private val playerRepository: IPlayerRepository
) {

    fun addPlayer(player: Player) {
        playerRepository.addPlayer(player)

    }
}