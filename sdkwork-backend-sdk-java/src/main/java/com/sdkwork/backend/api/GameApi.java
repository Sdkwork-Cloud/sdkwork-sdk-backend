package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class GameApi {
    private final HttpClient client;
    
    public GameApi(HttpClient client) {
        this.client = client;
    }

    /** Update game definition */
    public PlusApiResultPlusGameDefinitionVO update(PlusGameDefinitionForm body) throws Exception {
        return (PlusApiResultPlusGameDefinitionVO) client.put(ApiPaths.backendPath("/game/definition"), body);
    }

    /** Create game definition */
    public PlusApiResultPlusGameDefinitionVO create(PlusGameDefinitionForm body) throws Exception {
        return (PlusApiResultPlusGameDefinitionVO) client.post(ApiPaths.backendPath("/game/definition"), body);
    }

    /** Register tournament */
    public PlusApiResultBoolean registerTournament(String tournamentId, PlusGameTournamentRegistrationForm body) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/game/tournaments/" + tournamentId + "/register"), body);
    }

    /** Manage tournament player */
    public PlusApiResultPlusGameTournamentPlayerVO manageTournamentPlayer(String tournamentId, String userId, PlusGameTournamentPlayerManageForm body) throws Exception {
        return (PlusApiResultPlusGameTournamentPlayerVO) client.post(ApiPaths.backendPath("/game/tournaments/" + tournamentId + "/players/" + userId + "/manage"), body);
    }

    /** List tournament players by page */
    public PlusApiResultPagePlusGameTournamentPlayerVO listTournamentPlayers(String tournamentId, PlusGameTournamentPlayerQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusGameTournamentPlayerVO) client.post(ApiPaths.backendPath("/game/tournaments/" + tournamentId + "/players/list"), body, params);
    }

    /** Batch update tournament player status */
    public PlusApiResultListPlusGameTournamentPlayerVO batchUpdateTournamentPlayerStatus(String tournamentId, PlusGameTournamentBatchStatusForm body) throws Exception {
        return (PlusApiResultListPlusGameTournamentPlayerVO) client.post(ApiPaths.backendPath("/game/tournaments/" + tournamentId + "/players/batch_status"), body);
    }

    /** Batch finish tournament players */
    public PlusApiResultListPlusGameTournamentPlayerVO batchFinishTournamentPlayers(String tournamentId, PlusGameTournamentBatchStatusForm body) throws Exception {
        return (PlusApiResultListPlusGameTournamentPlayerVO) client.post(ApiPaths.backendPath("/game/tournaments/" + tournamentId + "/players/batch_finish"), body);
    }

    /** Batch eliminate tournament players */
    public PlusApiResultListPlusGameTournamentPlayerVO batchEliminateTournamentPlayers(String tournamentId, PlusGameTournamentBatchStatusForm body) throws Exception {
        return (PlusApiResultListPlusGameTournamentPlayerVO) client.post(ApiPaths.backendPath("/game/tournaments/" + tournamentId + "/players/batch_eliminate"), body);
    }

    /** Batch check in tournament players */
    public PlusApiResultListPlusGameTournamentPlayerVO batchCheckInTournamentPlayers(String tournamentId, PlusGameTournamentBatchStatusForm body) throws Exception {
        return (PlusApiResultListPlusGameTournamentPlayerVO) client.post(ApiPaths.backendPath("/game/tournaments/" + tournamentId + "/players/batch_check_in"), body);
    }

    /** Batch arrange tournament players */
    public PlusApiResultListPlusGameTournamentPlayerVO batchArrangeTournamentPlayers(String tournamentId, PlusGameTournamentBatchArrangeForm body) throws Exception {
        return (PlusApiResultListPlusGameTournamentPlayerVO) client.post(ApiPaths.backendPath("/game/tournaments/" + tournamentId + "/players/batch_arrange"), body);
    }

    /** Batch advance tournament players */
    public PlusApiResultListPlusGameTournamentPlayerVO batchAdvanceTournamentPlayers(String tournamentId, PlusGameTournamentBatchStatusForm body) throws Exception {
        return (PlusApiResultListPlusGameTournamentPlayerVO) client.post(ApiPaths.backendPath("/game/tournaments/" + tournamentId + "/players/batch_advance"), body);
    }

    /** Manage tournament */
    public PlusApiResultPlusGameTournamentVO manageTournament(String tournamentId, PlusGameTournamentManageForm body) throws Exception {
        return (PlusApiResultPlusGameTournamentVO) client.post(ApiPaths.backendPath("/game/tournaments/" + tournamentId + "/manage"), body);
    }

    /** Cancel tournament registration */
    public PlusApiResultBoolean cancelTournamentRegistration(String tournamentId, PlusGameTournamentRegistrationForm body) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/game/tournaments/" + tournamentId + "/cancel_registration"), body);
    }

    /** List tournaments by page */
    public PlusApiResultPagePlusGameTournamentVO listTournaments(PlusGameTournamentQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusGameTournamentVO) client.post(ApiPaths.backendPath("/game/tournaments/list"), body, params);
    }

    /** Refresh player stats */
    public PlusApiResultPlusGameStatsVO refreshStats(PlusGameStatsQueryForm body) throws Exception {
        return (PlusApiResultPlusGameStatsVO) client.post(ApiPaths.backendPath("/game/stats/refresh"), body);
    }

    /** Get player stats */
    public PlusApiResultPlusGameStatsVO getStats(PlusGameStatsQueryForm body) throws Exception {
        return (PlusApiResultPlusGameStatsVO) client.post(ApiPaths.backendPath("/game/stats/get"), body);
    }

    /** List score records by page */
    public PlusApiResultPagePlusGameScoreRecordVO listScoreRecords(PlusGameScoreRecordQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusGameScoreRecordVO) client.post(ApiPaths.backendPath("/game/score-records/list"), body, params);
    }

    /** Manage room seat */
    public PlusApiResultPlusGameRoomSeatVO manageRoomSeat(String roomId, String seatNo, PlusGameRoomSeatManageForm body) throws Exception {
        return (PlusApiResultPlusGameRoomSeatVO) client.post(ApiPaths.backendPath("/game/rooms/" + roomId + "/seats/" + seatNo + "/manage"), body);
    }

    /** List room seats by page */
    public PlusApiResultPagePlusGameRoomSeatVO listRoomSeats(String roomId, PlusGameRoomSeatQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusGameRoomSeatVO) client.post(ApiPaths.backendPath("/game/rooms/" + roomId + "/seats/list"), body, params);
    }

    /** Dismiss room */
    public PlusApiResultPlusGameRoomVO dismissRoom(String roomId, PlusGameDismissRoomForm body) throws Exception {
        return (PlusApiResultPlusGameRoomVO) client.post(ApiPaths.backendPath("/game/rooms/" + roomId + "/dismiss"), body);
    }

    /** List rooms by page */
    public PlusApiResultPagePlusGameRoomVO listRooms(PlusGameRoomQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusGameRoomVO) client.post(ApiPaths.backendPath("/game/rooms/list"), body, params);
    }

    /** Manage replay */
    public PlusApiResultPlusGameReplayVO manageReplay(String replayId, PlusGameReplayManageForm body) throws Exception {
        return (PlusApiResultPlusGameReplayVO) client.post(ApiPaths.backendPath("/game/replays/" + replayId + "/manage"), body);
    }

    /** List replays by page */
    public PlusApiResultPagePlusGameReplayVO listReplays(PlusGameReplayQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusGameReplayVO) client.post(ApiPaths.backendPath("/game/replays/list"), body, params);
    }

    /** List records by page */
    public PlusApiResultPagePlusGameRecordVO listRecords(PlusGameRecordQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusGameRecordVO) client.post(ApiPaths.backendPath("/game/records/list"), body, params);
    }

    /** Settle match */
    public PlusApiResultPlusGameMatchVO settleMatch(String matchId) throws Exception {
        return (PlusApiResultPlusGameMatchVO) client.post(ApiPaths.backendPath("/game/matches/" + matchId + "/settle"), null);
    }

    /** Manage match */
    public PlusApiResultPlusGameMatchVO manageMatch(String matchId, PlusGameMatchManageForm body) throws Exception {
        return (PlusApiResultPlusGameMatchVO) client.post(ApiPaths.backendPath("/game/matches/" + matchId + "/manage"), body);
    }

    /** Start match */
    public PlusApiResultPlusGameMatchVO startMatch(PlusGameStartMatchForm body) throws Exception {
        return (PlusApiResultPlusGameMatchVO) client.post(ApiPaths.backendPath("/game/matches/start"), body);
    }

    /** List matches by page */
    public PlusApiResultPagePlusGameMatchVO listMatches(PlusGameMatchQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusGameMatchVO) client.post(ApiPaths.backendPath("/game/matches/list"), body, params);
    }

    /** List leaderboard entries by page */
    public PlusApiResultPagePlusGameLeaderboardEntryVO listLeaderboardEntries(String leaderboardId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusGameLeaderboardEntryVO) client.post(ApiPaths.backendPath("/game/leaderboards/" + leaderboardId + "/entries/list"), null, params);
    }

    /** List leaderboards by page */
    public PlusApiResultPagePlusGameLeaderboardVO listLeaderboards(PlusGameLeaderboardQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusGameLeaderboardVO) client.post(ApiPaths.backendPath("/game/leaderboards/list"), body, params);
    }

    /** List user honors */
    public PlusApiResultListPlusGameHonorVO listHonors(PlusGameHonorQueryForm body) throws Exception {
        return (PlusApiResultListPlusGameHonorVO) client.post(ApiPaths.backendPath("/game/honors/list"), body);
    }

    /** List growth reward claims */
    public PlusApiResultListPlusGameGrowthRewardClaimVO listGrowthRewardClaims(PlusGameGrowthRewardClaimQueryForm body) throws Exception {
        return (PlusApiResultListPlusGameGrowthRewardClaimVO) client.post(ApiPaths.backendPath("/game/growth/reward-claims/list"), body);
    }

    /** List growth records by page */
    public PlusApiResultPagePlusGameGrowthRecordVO listGrowthRecords(PlusGameGrowthRecordQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusGameGrowthRecordVO) client.post(ApiPaths.backendPath("/game/growth/records/list"), body, params);
    }

    /** List growth level configs by page */
    public PlusApiResultPagePlusGameGrowthLevelConfigVO listGrowthLevelConfigs(PlusGameGrowthLevelConfigQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusGameGrowthLevelConfigVO) client.post(ApiPaths.backendPath("/game/growth/level-configs/list"), body, params);
    }

    /** Refresh growth account */
    public PlusApiResultPlusGameGrowthAccountVO refreshGrowthAccount(PlusGameGrowthAccountRefreshForm body) throws Exception {
        return (PlusApiResultPlusGameGrowthAccountVO) client.post(ApiPaths.backendPath("/game/growth/accounts/refresh"), body);
    }

    /** List growth accounts by page */
    public PlusApiResultPagePlusGameGrowthAccountVO listGrowthAccounts(PlusGameGrowthAccountQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusGameGrowthAccountVO) client.post(ApiPaths.backendPath("/game/growth/accounts/list"), body, params);
    }

    /** List game definitions by page */
    public PlusApiResultPagePlusGameDefinitionVO listByPage(PlusGameDefinitionQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusGameDefinitionVO) client.post(ApiPaths.backendPath("/game/definition/list"), body, params);
    }

    /** List all game definitions */
    public PlusApiResultListPlusGameDefinitionVO listAll(PlusGameDefinitionQueryForm body) throws Exception {
        return (PlusApiResultListPlusGameDefinitionVO) client.post(ApiPaths.backendPath("/game/definition/list/all"), body);
    }

    /** Manage challenge */
    public PlusApiResultPlusGameChallengeVO manageChallenge(String challengeId, PlusGameChallengeManageForm body) throws Exception {
        return (PlusApiResultPlusGameChallengeVO) client.post(ApiPaths.backendPath("/game/challenges/" + challengeId + "/manage"), body);
    }

    /** List challenges by page */
    public PlusApiResultPagePlusGameChallengeVO listChallenges(PlusGameChallengeQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusGameChallengeVO) client.post(ApiPaths.backendPath("/game/challenges/list"), body, params);
    }

    /** Create challenge */
    public PlusApiResultPlusGameChallengeVO createChallenge(PlusGameChallengeCreateForm body) throws Exception {
        return (PlusApiResultPlusGameChallengeVO) client.post(ApiPaths.backendPath("/game/challenges/create"), body);
    }

    /** Manage arena */
    public PlusApiResultPlusGameArenaVO manageArena(String arenaId, PlusGameArenaManageForm body) throws Exception {
        return (PlusApiResultPlusGameArenaVO) client.post(ApiPaths.backendPath("/game/arenas/" + arenaId + "/manage"), body);
    }

    /** Open arena */
    public PlusApiResultPlusGameArenaVO openArena(PlusGameArenaManageForm body) throws Exception {
        return (PlusApiResultPlusGameArenaVO) client.post(ApiPaths.backendPath("/game/arenas/open"), body);
    }

    /** List arenas by page */
    public PlusApiResultPagePlusGameArenaVO listArenas(PlusGameArenaQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusGameArenaVO) client.post(ApiPaths.backendPath("/game/arenas/list"), body, params);
    }

    /** List action records by page */
    public PlusApiResultPagePlusGameActionRecordVO listActions(PlusGameActionRecordQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusGameActionRecordVO) client.post(ApiPaths.backendPath("/game/actions/list"), body, params);
    }

    /** Get tournament detail */
    public PlusApiResultPlusGameTournamentVO getTournament(String tournamentId) throws Exception {
        return (PlusApiResultPlusGameTournamentVO) client.get(ApiPaths.backendPath("/game/tournaments/" + tournamentId + ""));
    }

    /** Get tournament player detail */
    public PlusApiResultPlusGameTournamentPlayerVO getTournamentPlayer(String tournamentId, String userId) throws Exception {
        return (PlusApiResultPlusGameTournamentPlayerVO) client.get(ApiPaths.backendPath("/game/tournaments/" + tournamentId + "/players/" + userId + ""));
    }

    /** Get score record detail */
    public PlusApiResultPlusGameScoreRecordVO getScoreRecord(String recordId) throws Exception {
        return (PlusApiResultPlusGameScoreRecordVO) client.get(ApiPaths.backendPath("/game/score-records/" + recordId + ""));
    }

    /** Get room detail */
    public PlusApiResultPlusGameRoomVO getRoom(String roomId) throws Exception {
        return (PlusApiResultPlusGameRoomVO) client.get(ApiPaths.backendPath("/game/rooms/" + roomId + ""));
    }

    /** Get room seat detail */
    public PlusApiResultPlusGameRoomSeatVO getRoomSeat(String roomId, String seatNo) throws Exception {
        return (PlusApiResultPlusGameRoomSeatVO) client.get(ApiPaths.backendPath("/game/rooms/" + roomId + "/seats/" + seatNo + ""));
    }

    /** Get replay detail */
    public PlusApiResultPlusGameReplayVO getReplay(String replayId) throws Exception {
        return (PlusApiResultPlusGameReplayVO) client.get(ApiPaths.backendPath("/game/replays/" + replayId + ""));
    }

    /** Get replay by match */
    public PlusApiResultPlusGameReplayVO getReplayByMatch(String matchId) throws Exception {
        return (PlusApiResultPlusGameReplayVO) client.get(ApiPaths.backendPath("/game/replays/match/" + matchId + ""));
    }

    /** Get match record by user */
    public PlusApiResultPlusGameRecordVO getRecord(String matchId, String userId) throws Exception {
        return (PlusApiResultPlusGameRecordVO) client.get(ApiPaths.backendPath("/game/records/matches/" + matchId + "/users/" + userId + ""));
    }

    /** Get match detail */
    public PlusApiResultPlusGameMatchVO getMatch(String matchId) throws Exception {
        return (PlusApiResultPlusGameMatchVO) client.get(ApiPaths.backendPath("/game/matches/" + matchId + ""));
    }

    /** Get leaderboard detail */
    public PlusApiResultPlusGameLeaderboardVO getLeaderboard(String leaderboardId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPlusGameLeaderboardVO) client.get(ApiPaths.backendPath("/game/leaderboards/" + leaderboardId + ""), params);
    }

    /** Get leaderboard entry by user */
    public PlusApiResultPlusGameLeaderboardEntryVO getLeaderboardEntry(String leaderboardId, String userId) throws Exception {
        return (PlusApiResultPlusGameLeaderboardEntryVO) client.get(ApiPaths.backendPath("/game/leaderboards/" + leaderboardId + "/entries/" + userId + ""));
    }

    /** Get growth record detail */
    public PlusApiResultPlusGameGrowthRecordVO getGrowthRecord(String recordId) throws Exception {
        return (PlusApiResultPlusGameGrowthRecordVO) client.get(ApiPaths.backendPath("/game/growth/records/" + recordId + ""));
    }

    /** Get growth level config detail */
    public PlusApiResultPlusGameGrowthLevelConfigVO getGrowthLevelConfig(String configId) throws Exception {
        return (PlusApiResultPlusGameGrowthLevelConfigVO) client.get(ApiPaths.backendPath("/game/growth/level-configs/" + configId + ""));
    }

    /** Get growth account detail */
    public PlusApiResultPlusGameGrowthAccountVO getGrowthAccount(String accountId) throws Exception {
        return (PlusApiResultPlusGameGrowthAccountVO) client.get(ApiPaths.backendPath("/game/growth/accounts/" + accountId + ""));
    }

    /** List growth reward claims by account */
    public PlusApiResultListPlusGameGrowthRewardClaimVO listGrowthRewardClaimsByAccount(String accountId) throws Exception {
        return (PlusApiResultListPlusGameGrowthRewardClaimVO) client.get(ApiPaths.backendPath("/game/growth/accounts/" + accountId + "/reward-claims"));
    }

    /** Get game definition */
    public PlusApiResultPlusGameDefinitionVO getById(String id) throws Exception {
        return (PlusApiResultPlusGameDefinitionVO) client.get(ApiPaths.backendPath("/game/definition/" + id + ""));
    }

    /** Delete game definition */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/game/definition/" + id + ""));
    }

    /** Get challenge detail */
    public PlusApiResultPlusGameChallengeVO getChallenge(String challengeId) throws Exception {
        return (PlusApiResultPlusGameChallengeVO) client.get(ApiPaths.backendPath("/game/challenges/" + challengeId + ""));
    }

    /** Get arena detail */
    public PlusApiResultPlusGameArenaVO getArena(String arenaId) throws Exception {
        return (PlusApiResultPlusGameArenaVO) client.get(ApiPaths.backendPath("/game/arenas/" + arenaId + ""));
    }

    /** Get action record detail */
    public PlusApiResultPlusGameActionRecordVO getAction(String actionId) throws Exception {
        return (PlusApiResultPlusGameActionRecordVO) client.get(ApiPaths.backendPath("/game/actions/" + actionId + ""));
    }
}
