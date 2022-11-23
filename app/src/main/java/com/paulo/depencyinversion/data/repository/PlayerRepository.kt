package com.paulo.depencyinversion.data.repository

import com.paulo.depencyinversion.data.mapToPlayerEntity
import com.paulo.depencyinversion.domain.entity.Player
import com.paulo.depencyinversion.domain.repository.IPlayerRepository

class PlayerRepository(
    private val playerDatabase: IPlayerDatabase
): IPlayerRepository {

   override fun addPlayer( player: Player){
       playerDatabase.addPlayer(player.mapToPlayerEntity())
   }
}