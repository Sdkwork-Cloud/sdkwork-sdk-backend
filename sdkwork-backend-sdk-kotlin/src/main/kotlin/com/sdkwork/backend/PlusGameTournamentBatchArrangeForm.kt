package com.sdkwork.backend

data class PlusGameTournamentBatchArrangeForm(
    val userIds: List<Int>? = null,
    val arrangePlayers: List<PlusGameTournamentBatchArrangePlayerForm>? = null,
    val seedNoStart: Int? = null,
    val teamNoStart: Int? = null,
    val groupSize: Int? = null,
    val overwriteExistingSeedNo: Boolean? = null,
    val overwriteExistingTeamNo: Boolean? = null
)
