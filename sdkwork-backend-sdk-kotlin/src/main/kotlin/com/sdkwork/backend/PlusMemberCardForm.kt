package com.sdkwork.backend

data class PlusMemberCardForm(
    val card: PlusCard? = null,
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
