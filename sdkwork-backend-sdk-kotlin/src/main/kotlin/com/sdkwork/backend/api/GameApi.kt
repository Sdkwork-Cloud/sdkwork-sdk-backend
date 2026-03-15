package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class GameApi(private val client: HttpClient) {

    /** Update game definition */
    suspend fun update(body: PlusGameDefinitionForm): PlusApiResultPlusGameDefinitionVO? {
        return client.put(ApiPaths.backendPath("/game/definition"), body) as? PlusApiResultPlusGameDefinitionVO
    }

    /** Create game definition */
    suspend fun create(body: PlusGameDefinitionForm): PlusApiResultPlusGameDefinitionVO? {
        return client.post(ApiPaths.backendPath("/game/definition"), body) as? PlusApiResultPlusGameDefinitionVO
    }

    /** Register tournament */
    suspend fun registerTournament(tournamentId: String, body: PlusGameTournamentRegistrationForm): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/game/tournaments/$tournamentId/register"), body) as? PlusApiResultBoolean
    }

    /** Manage tournament player */
    suspend fun manageTournamentPlayer(tournamentId: String, userId: String, body: PlusGameTournamentPlayerManageForm? = null): PlusApiResultPlusGameTournamentPlayerVO? {
        return client.post(ApiPaths.backendPath("/game/tournaments/$tournamentId/players/$userId/manage"), body) as? PlusApiResultPlusGameTournamentPlayerVO
    }

    /** List tournament players by page */
    suspend fun listTournamentPlayers(tournamentId: String, body: PlusGameTournamentPlayerQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusGameTournamentPlayerVO? {
        return client.post(ApiPaths.backendPath("/game/tournaments/$tournamentId/players/list"), body, params) as? PlusApiResultPagePlusGameTournamentPlayerVO
    }

    /** Batch update tournament player status */
    suspend fun batchUpdateTournamentPlayerStatus(tournamentId: String, body: PlusGameTournamentBatchStatusForm? = null): PlusApiResultListPlusGameTournamentPlayerVO? {
        return client.post(ApiPaths.backendPath("/game/tournaments/$tournamentId/players/batch_status"), body) as? PlusApiResultListPlusGameTournamentPlayerVO
    }

    /** Batch finish tournament players */
    suspend fun batchFinishTournamentPlayers(tournamentId: String, body: PlusGameTournamentBatchStatusForm? = null): PlusApiResultListPlusGameTournamentPlayerVO? {
        return client.post(ApiPaths.backendPath("/game/tournaments/$tournamentId/players/batch_finish"), body) as? PlusApiResultListPlusGameTournamentPlayerVO
    }

    /** Batch eliminate tournament players */
    suspend fun batchEliminateTournamentPlayers(tournamentId: String, body: PlusGameTournamentBatchStatusForm? = null): PlusApiResultListPlusGameTournamentPlayerVO? {
        return client.post(ApiPaths.backendPath("/game/tournaments/$tournamentId/players/batch_eliminate"), body) as? PlusApiResultListPlusGameTournamentPlayerVO
    }

    /** Batch check in tournament players */
    suspend fun batchCheckInTournamentPlayers(tournamentId: String, body: PlusGameTournamentBatchStatusForm? = null): PlusApiResultListPlusGameTournamentPlayerVO? {
        return client.post(ApiPaths.backendPath("/game/tournaments/$tournamentId/players/batch_check_in"), body) as? PlusApiResultListPlusGameTournamentPlayerVO
    }

    /** Batch arrange tournament players */
    suspend fun batchArrangeTournamentPlayers(tournamentId: String, body: PlusGameTournamentBatchArrangeForm? = null): PlusApiResultListPlusGameTournamentPlayerVO? {
        return client.post(ApiPaths.backendPath("/game/tournaments/$tournamentId/players/batch_arrange"), body) as? PlusApiResultListPlusGameTournamentPlayerVO
    }

    /** Batch advance tournament players */
    suspend fun batchAdvanceTournamentPlayers(tournamentId: String, body: PlusGameTournamentBatchStatusForm? = null): PlusApiResultListPlusGameTournamentPlayerVO? {
        return client.post(ApiPaths.backendPath("/game/tournaments/$tournamentId/players/batch_advance"), body) as? PlusApiResultListPlusGameTournamentPlayerVO
    }

    /** Manage tournament */
    suspend fun manageTournament(tournamentId: String, body: PlusGameTournamentManageForm? = null): PlusApiResultPlusGameTournamentVO? {
        return client.post(ApiPaths.backendPath("/game/tournaments/$tournamentId/manage"), body) as? PlusApiResultPlusGameTournamentVO
    }

    /** Cancel tournament registration */
    suspend fun cancelTournamentRegistration(tournamentId: String, body: PlusGameTournamentRegistrationForm): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/game/tournaments/$tournamentId/cancel_registration"), body) as? PlusApiResultBoolean
    }

    /** List tournaments by page */
    suspend fun listTournaments(body: PlusGameTournamentQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusGameTournamentVO? {
        return client.post(ApiPaths.backendPath("/game/tournaments/list"), body, params) as? PlusApiResultPagePlusGameTournamentVO
    }

    /** Refresh player stats */
    suspend fun refreshStats(body: PlusGameStatsQueryForm): PlusApiResultPlusGameStatsVO? {
        return client.post(ApiPaths.backendPath("/game/stats/refresh"), body) as? PlusApiResultPlusGameStatsVO
    }

    /** Get player stats */
    suspend fun getStats(body: PlusGameStatsQueryForm): PlusApiResultPlusGameStatsVO? {
        return client.post(ApiPaths.backendPath("/game/stats/get"), body) as? PlusApiResultPlusGameStatsVO
    }

    /** List score records by page */
    suspend fun listScoreRecords(body: PlusGameScoreRecordQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusGameScoreRecordVO? {
        return client.post(ApiPaths.backendPath("/game/score-records/list"), body, params) as? PlusApiResultPagePlusGameScoreRecordVO
    }

    /** Manage room seat */
    suspend fun manageRoomSeat(roomId: String, seatNo: String, body: PlusGameRoomSeatManageForm? = null): PlusApiResultPlusGameRoomSeatVO? {
        return client.post(ApiPaths.backendPath("/game/rooms/$roomId/seats/$seatNo/manage"), body) as? PlusApiResultPlusGameRoomSeatVO
    }

    /** List room seats by page */
    suspend fun listRoomSeats(roomId: String, body: PlusGameRoomSeatQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusGameRoomSeatVO? {
        return client.post(ApiPaths.backendPath("/game/rooms/$roomId/seats/list"), body, params) as? PlusApiResultPagePlusGameRoomSeatVO
    }

    /** Dismiss room */
    suspend fun dismissRoom(roomId: String, body: PlusGameDismissRoomForm? = null): PlusApiResultPlusGameRoomVO? {
        return client.post(ApiPaths.backendPath("/game/rooms/$roomId/dismiss"), body) as? PlusApiResultPlusGameRoomVO
    }

    /** List rooms by page */
    suspend fun listRooms(body: PlusGameRoomQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusGameRoomVO? {
        return client.post(ApiPaths.backendPath("/game/rooms/list"), body, params) as? PlusApiResultPagePlusGameRoomVO
    }

    /** Manage replay */
    suspend fun manageReplay(replayId: String, body: PlusGameReplayManageForm? = null): PlusApiResultPlusGameReplayVO? {
        return client.post(ApiPaths.backendPath("/game/replays/$replayId/manage"), body) as? PlusApiResultPlusGameReplayVO
    }

    /** List replays by page */
    suspend fun listReplays(body: PlusGameReplayQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusGameReplayVO? {
        return client.post(ApiPaths.backendPath("/game/replays/list"), body, params) as? PlusApiResultPagePlusGameReplayVO
    }

    /** List records by page */
    suspend fun listRecords(body: PlusGameRecordQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusGameRecordVO? {
        return client.post(ApiPaths.backendPath("/game/records/list"), body, params) as? PlusApiResultPagePlusGameRecordVO
    }

    /** Settle match */
    suspend fun settleMatch(matchId: String): PlusApiResultPlusGameMatchVO? {
        return client.post(ApiPaths.backendPath("/game/matches/$matchId/settle"), null) as? PlusApiResultPlusGameMatchVO
    }

    /** Manage match */
    suspend fun manageMatch(matchId: String, body: PlusGameMatchManageForm? = null): PlusApiResultPlusGameMatchVO? {
        return client.post(ApiPaths.backendPath("/game/matches/$matchId/manage"), body) as? PlusApiResultPlusGameMatchVO
    }

    /** Start match */
    suspend fun startMatch(body: PlusGameStartMatchForm): PlusApiResultPlusGameMatchVO? {
        return client.post(ApiPaths.backendPath("/game/matches/start"), body) as? PlusApiResultPlusGameMatchVO
    }

    /** List matches by page */
    suspend fun listMatches(body: PlusGameMatchQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusGameMatchVO? {
        return client.post(ApiPaths.backendPath("/game/matches/list"), body, params) as? PlusApiResultPagePlusGameMatchVO
    }

    /** List leaderboard entries by page */
    suspend fun listLeaderboardEntries(leaderboardId: String, params: Map<String, Any>? = null): PlusApiResultPagePlusGameLeaderboardEntryVO? {
        return client.post(ApiPaths.backendPath("/game/leaderboards/$leaderboardId/entries/list"), null, params) as? PlusApiResultPagePlusGameLeaderboardEntryVO
    }

    /** List leaderboards by page */
    suspend fun listLeaderboards(body: PlusGameLeaderboardQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusGameLeaderboardVO? {
        return client.post(ApiPaths.backendPath("/game/leaderboards/list"), body, params) as? PlusApiResultPagePlusGameLeaderboardVO
    }

    /** List user honors */
    suspend fun listHonors(body: PlusGameHonorQueryForm): PlusApiResultListPlusGameHonorVO? {
        return client.post(ApiPaths.backendPath("/game/honors/list"), body) as? PlusApiResultListPlusGameHonorVO
    }

    /** List growth reward claims */
    suspend fun listGrowthRewardClaims(body: PlusGameGrowthRewardClaimQueryForm? = null): PlusApiResultListPlusGameGrowthRewardClaimVO? {
        return client.post(ApiPaths.backendPath("/game/growth/reward-claims/list"), body) as? PlusApiResultListPlusGameGrowthRewardClaimVO
    }

    /** List growth records by page */
    suspend fun listGrowthRecords(body: PlusGameGrowthRecordQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusGameGrowthRecordVO? {
        return client.post(ApiPaths.backendPath("/game/growth/records/list"), body, params) as? PlusApiResultPagePlusGameGrowthRecordVO
    }

    /** List growth level configs by page */
    suspend fun listGrowthLevelConfigs(body: PlusGameGrowthLevelConfigQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusGameGrowthLevelConfigVO? {
        return client.post(ApiPaths.backendPath("/game/growth/level-configs/list"), body, params) as? PlusApiResultPagePlusGameGrowthLevelConfigVO
    }

    /** Refresh growth account */
    suspend fun refreshGrowthAccount(body: PlusGameGrowthAccountRefreshForm): PlusApiResultPlusGameGrowthAccountVO? {
        return client.post(ApiPaths.backendPath("/game/growth/accounts/refresh"), body) as? PlusApiResultPlusGameGrowthAccountVO
    }

    /** List growth accounts by page */
    suspend fun listGrowthAccounts(body: PlusGameGrowthAccountQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusGameGrowthAccountVO? {
        return client.post(ApiPaths.backendPath("/game/growth/accounts/list"), body, params) as? PlusApiResultPagePlusGameGrowthAccountVO
    }

    /** List game definitions by page */
    suspend fun listByPage(body: PlusGameDefinitionQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusGameDefinitionVO? {
        return client.post(ApiPaths.backendPath("/game/definition/list"), body, params) as? PlusApiResultPagePlusGameDefinitionVO
    }

    /** List all game definitions */
    suspend fun listAll(body: PlusGameDefinitionQueryForm? = null): PlusApiResultListPlusGameDefinitionVO? {
        return client.post(ApiPaths.backendPath("/game/definition/list/all"), body) as? PlusApiResultListPlusGameDefinitionVO
    }

    /** Manage challenge */
    suspend fun manageChallenge(challengeId: String, body: PlusGameChallengeManageForm? = null): PlusApiResultPlusGameChallengeVO? {
        return client.post(ApiPaths.backendPath("/game/challenges/$challengeId/manage"), body) as? PlusApiResultPlusGameChallengeVO
    }

    /** List challenges by page */
    suspend fun listChallenges(body: PlusGameChallengeQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusGameChallengeVO? {
        return client.post(ApiPaths.backendPath("/game/challenges/list"), body, params) as? PlusApiResultPagePlusGameChallengeVO
    }

    /** Create challenge */
    suspend fun createChallenge(body: PlusGameChallengeCreateForm? = null): PlusApiResultPlusGameChallengeVO? {
        return client.post(ApiPaths.backendPath("/game/challenges/create"), body) as? PlusApiResultPlusGameChallengeVO
    }

    /** Manage arena */
    suspend fun manageArena(arenaId: String, body: PlusGameArenaManageForm? = null): PlusApiResultPlusGameArenaVO? {
        return client.post(ApiPaths.backendPath("/game/arenas/$arenaId/manage"), body) as? PlusApiResultPlusGameArenaVO
    }

    /** Open arena */
    suspend fun openArena(body: PlusGameArenaManageForm? = null): PlusApiResultPlusGameArenaVO? {
        return client.post(ApiPaths.backendPath("/game/arenas/open"), body) as? PlusApiResultPlusGameArenaVO
    }

    /** List arenas by page */
    suspend fun listArenas(body: PlusGameArenaQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusGameArenaVO? {
        return client.post(ApiPaths.backendPath("/game/arenas/list"), body, params) as? PlusApiResultPagePlusGameArenaVO
    }

    /** List action records by page */
    suspend fun listActions(body: PlusGameActionRecordQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusGameActionRecordVO? {
        return client.post(ApiPaths.backendPath("/game/actions/list"), body, params) as? PlusApiResultPagePlusGameActionRecordVO
    }

    /** Get tournament detail */
    suspend fun getTournament(tournamentId: String): PlusApiResultPlusGameTournamentVO? {
        return client.get(ApiPaths.backendPath("/game/tournaments/$tournamentId")) as? PlusApiResultPlusGameTournamentVO
    }

    /** Get tournament player detail */
    suspend fun getTournamentPlayer(tournamentId: String, userId: String): PlusApiResultPlusGameTournamentPlayerVO? {
        return client.get(ApiPaths.backendPath("/game/tournaments/$tournamentId/players/$userId")) as? PlusApiResultPlusGameTournamentPlayerVO
    }

    /** Get score record detail */
    suspend fun getScoreRecord(recordId: String): PlusApiResultPlusGameScoreRecordVO? {
        return client.get(ApiPaths.backendPath("/game/score-records/$recordId")) as? PlusApiResultPlusGameScoreRecordVO
    }

    /** Get room detail */
    suspend fun getRoom(roomId: String): PlusApiResultPlusGameRoomVO? {
        return client.get(ApiPaths.backendPath("/game/rooms/$roomId")) as? PlusApiResultPlusGameRoomVO
    }

    /** Get room seat detail */
    suspend fun getRoomSeat(roomId: String, seatNo: String): PlusApiResultPlusGameRoomSeatVO? {
        return client.get(ApiPaths.backendPath("/game/rooms/$roomId/seats/$seatNo")) as? PlusApiResultPlusGameRoomSeatVO
    }

    /** Get replay detail */
    suspend fun getReplay(replayId: String): PlusApiResultPlusGameReplayVO? {
        return client.get(ApiPaths.backendPath("/game/replays/$replayId")) as? PlusApiResultPlusGameReplayVO
    }

    /** Get replay by match */
    suspend fun getReplayByMatch(matchId: String): PlusApiResultPlusGameReplayVO? {
        return client.get(ApiPaths.backendPath("/game/replays/match/$matchId")) as? PlusApiResultPlusGameReplayVO
    }

    /** Get match record by user */
    suspend fun getRecord(matchId: String, userId: String): PlusApiResultPlusGameRecordVO? {
        return client.get(ApiPaths.backendPath("/game/records/matches/$matchId/users/$userId")) as? PlusApiResultPlusGameRecordVO
    }

    /** Get match detail */
    suspend fun getMatch(matchId: String): PlusApiResultPlusGameMatchVO? {
        return client.get(ApiPaths.backendPath("/game/matches/$matchId")) as? PlusApiResultPlusGameMatchVO
    }

    /** Get leaderboard detail */
    suspend fun getLeaderboard(leaderboardId: String, params: Map<String, Any>? = null): PlusApiResultPlusGameLeaderboardVO? {
        return client.get(ApiPaths.backendPath("/game/leaderboards/$leaderboardId"), params) as? PlusApiResultPlusGameLeaderboardVO
    }

    /** Get leaderboard entry by user */
    suspend fun getLeaderboardEntry(leaderboardId: String, userId: String): PlusApiResultPlusGameLeaderboardEntryVO? {
        return client.get(ApiPaths.backendPath("/game/leaderboards/$leaderboardId/entries/$userId")) as? PlusApiResultPlusGameLeaderboardEntryVO
    }

    /** Get growth record detail */
    suspend fun getGrowthRecord(recordId: String): PlusApiResultPlusGameGrowthRecordVO? {
        return client.get(ApiPaths.backendPath("/game/growth/records/$recordId")) as? PlusApiResultPlusGameGrowthRecordVO
    }

    /** Get growth level config detail */
    suspend fun getGrowthLevelConfig(configId: String): PlusApiResultPlusGameGrowthLevelConfigVO? {
        return client.get(ApiPaths.backendPath("/game/growth/level-configs/$configId")) as? PlusApiResultPlusGameGrowthLevelConfigVO
    }

    /** Get growth account detail */
    suspend fun getGrowthAccount(accountId: String): PlusApiResultPlusGameGrowthAccountVO? {
        return client.get(ApiPaths.backendPath("/game/growth/accounts/$accountId")) as? PlusApiResultPlusGameGrowthAccountVO
    }

    /** List growth reward claims by account */
    suspend fun listGrowthRewardClaimsByAccount(accountId: String): PlusApiResultListPlusGameGrowthRewardClaimVO? {
        return client.get(ApiPaths.backendPath("/game/growth/accounts/$accountId/reward-claims")) as? PlusApiResultListPlusGameGrowthRewardClaimVO
    }

    /** Get game definition */
    suspend fun getById(id: String): PlusApiResultPlusGameDefinitionVO? {
        return client.get(ApiPaths.backendPath("/game/definition/$id")) as? PlusApiResultPlusGameDefinitionVO
    }

    /** Delete game definition */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/game/definition/$id")) as? PlusApiResultBoolean
    }

    /** Get challenge detail */
    suspend fun getChallenge(challengeId: String): PlusApiResultPlusGameChallengeVO? {
        return client.get(ApiPaths.backendPath("/game/challenges/$challengeId")) as? PlusApiResultPlusGameChallengeVO
    }

    /** Get arena detail */
    suspend fun getArena(arenaId: String): PlusApiResultPlusGameArenaVO? {
        return client.get(ApiPaths.backendPath("/game/arenas/$arenaId")) as? PlusApiResultPlusGameArenaVO
    }

    /** Get action record detail */
    suspend fun getAction(actionId: String): PlusApiResultPlusGameActionRecordVO? {
        return client.get(ApiPaths.backendPath("/game/actions/$actionId")) as? PlusApiResultPlusGameActionRecordVO
    }
}
