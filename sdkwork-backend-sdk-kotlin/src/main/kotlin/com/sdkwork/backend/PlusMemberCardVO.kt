package com.sdkwork.backend

data class PlusMemberCardVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val cardId: Int? = null,
    val supplyBonus: Boolean? = null,
    val supplyBalance: Boolean? = null,
    val bonusName: String? = null,
    val balanceName: String? = null,
    val prerogative: String? = null,
    val autoActivate: Boolean? = null,
    val wxActivate: Boolean? = null,
    val costMoneyUnit: Int? = null,
    val increaseBonus: Int? = null,
    val initIncreaseBonus: Int? = null,
    val maxIncreaseBonus: Int? = null,
    val costBonusUnit: Int? = null,
    val reduceMoney: Int? = null,
    val leastMoneyToUseBonus: Int? = null,
    val maxReduceBonus: Int? = null
)
