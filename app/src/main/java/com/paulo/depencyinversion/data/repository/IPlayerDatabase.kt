package com.paulo.depencyinversion.data.repository

import com.paulo.depencyinversion.data.PlayerEntity

interface IPlayerDatabase {
    fun addPlayer(playerEntity: PlayerEntity)
}