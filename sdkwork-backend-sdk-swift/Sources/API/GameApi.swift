import Foundation

public class GameApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update game definition
    public func update(body: PlusGameDefinitionForm) async throws -> PlusApiResultPlusGameDefinitionVO? {
        let response = try await client.put(ApiPaths.backendPath("/game/definition"), body: body)
        return response as? PlusApiResultPlusGameDefinitionVO
    }

    /// Create game definition
    public func create(body: PlusGameDefinitionForm) async throws -> PlusApiResultPlusGameDefinitionVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/definition"), body: body)
        return response as? PlusApiResultPlusGameDefinitionVO
    }

    /// Register tournament
    public func registerTournament(tournamentId: String, body: PlusGameTournamentRegistrationForm) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/game/tournaments/\(tournamentId)/register"), body: body)
        return response as? PlusApiResultBoolean
    }

    /// Manage tournament player
    public func manageTournamentPlayer(tournamentId: String, userId: String, body: PlusGameTournamentPlayerManageForm? = nil) async throws -> PlusApiResultPlusGameTournamentPlayerVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/tournaments/\(tournamentId)/players/\(userId)/manage"), body: body)
        return response as? PlusApiResultPlusGameTournamentPlayerVO
    }

    /// List tournament players by page
    public func listTournamentPlayers(tournamentId: String, body: PlusGameTournamentPlayerQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusGameTournamentPlayerVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/tournaments/\(tournamentId)/players/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusGameTournamentPlayerVO
    }

    /// Batch update tournament player status
    public func batchUpdateTournamentPlayerStatus(tournamentId: String, body: PlusGameTournamentBatchStatusForm? = nil) async throws -> PlusApiResultListPlusGameTournamentPlayerVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/tournaments/\(tournamentId)/players/batch_status"), body: body)
        return response as? PlusApiResultListPlusGameTournamentPlayerVO
    }

    /// Batch finish tournament players
    public func batchFinishTournamentPlayers(tournamentId: String, body: PlusGameTournamentBatchStatusForm? = nil) async throws -> PlusApiResultListPlusGameTournamentPlayerVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/tournaments/\(tournamentId)/players/batch_finish"), body: body)
        return response as? PlusApiResultListPlusGameTournamentPlayerVO
    }

    /// Batch eliminate tournament players
    public func batchEliminateTournamentPlayers(tournamentId: String, body: PlusGameTournamentBatchStatusForm? = nil) async throws -> PlusApiResultListPlusGameTournamentPlayerVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/tournaments/\(tournamentId)/players/batch_eliminate"), body: body)
        return response as? PlusApiResultListPlusGameTournamentPlayerVO
    }

    /// Batch check in tournament players
    public func batchCheckInTournamentPlayers(tournamentId: String, body: PlusGameTournamentBatchStatusForm? = nil) async throws -> PlusApiResultListPlusGameTournamentPlayerVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/tournaments/\(tournamentId)/players/batch_check_in"), body: body)
        return response as? PlusApiResultListPlusGameTournamentPlayerVO
    }

    /// Batch arrange tournament players
    public func batchArrangeTournamentPlayers(tournamentId: String, body: PlusGameTournamentBatchArrangeForm? = nil) async throws -> PlusApiResultListPlusGameTournamentPlayerVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/tournaments/\(tournamentId)/players/batch_arrange"), body: body)
        return response as? PlusApiResultListPlusGameTournamentPlayerVO
    }

    /// Batch advance tournament players
    public func batchAdvanceTournamentPlayers(tournamentId: String, body: PlusGameTournamentBatchStatusForm? = nil) async throws -> PlusApiResultListPlusGameTournamentPlayerVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/tournaments/\(tournamentId)/players/batch_advance"), body: body)
        return response as? PlusApiResultListPlusGameTournamentPlayerVO
    }

    /// Manage tournament
    public func manageTournament(tournamentId: String, body: PlusGameTournamentManageForm? = nil) async throws -> PlusApiResultPlusGameTournamentVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/tournaments/\(tournamentId)/manage"), body: body)
        return response as? PlusApiResultPlusGameTournamentVO
    }

    /// Cancel tournament registration
    public func cancelTournamentRegistration(tournamentId: String, body: PlusGameTournamentRegistrationForm) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/game/tournaments/\(tournamentId)/cancel_registration"), body: body)
        return response as? PlusApiResultBoolean
    }

    /// List tournaments by page
    public func listTournaments(body: PlusGameTournamentQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusGameTournamentVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/tournaments/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusGameTournamentVO
    }

    /// Refresh player stats
    public func refreshStats(body: PlusGameStatsQueryForm) async throws -> PlusApiResultPlusGameStatsVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/stats/refresh"), body: body)
        return response as? PlusApiResultPlusGameStatsVO
    }

    /// Get player stats
    public func getStats(body: PlusGameStatsQueryForm) async throws -> PlusApiResultPlusGameStatsVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/stats/get"), body: body)
        return response as? PlusApiResultPlusGameStatsVO
    }

    /// List score records by page
    public func listScoreRecords(body: PlusGameScoreRecordQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusGameScoreRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/score-records/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusGameScoreRecordVO
    }

    /// Manage room seat
    public func manageRoomSeat(roomId: String, seatNo: String, body: PlusGameRoomSeatManageForm? = nil) async throws -> PlusApiResultPlusGameRoomSeatVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/rooms/\(roomId)/seats/\(seatNo)/manage"), body: body)
        return response as? PlusApiResultPlusGameRoomSeatVO
    }

    /// List room seats by page
    public func listRoomSeats(roomId: String, body: PlusGameRoomSeatQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusGameRoomSeatVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/rooms/\(roomId)/seats/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusGameRoomSeatVO
    }

    /// Dismiss room
    public func dismissRoom(roomId: String, body: PlusGameDismissRoomForm? = nil) async throws -> PlusApiResultPlusGameRoomVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/rooms/\(roomId)/dismiss"), body: body)
        return response as? PlusApiResultPlusGameRoomVO
    }

    /// List rooms by page
    public func listRooms(body: PlusGameRoomQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusGameRoomVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/rooms/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusGameRoomVO
    }

    /// Manage replay
    public func manageReplay(replayId: String, body: PlusGameReplayManageForm? = nil) async throws -> PlusApiResultPlusGameReplayVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/replays/\(replayId)/manage"), body: body)
        return response as? PlusApiResultPlusGameReplayVO
    }

    /// List replays by page
    public func listReplays(body: PlusGameReplayQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusGameReplayVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/replays/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusGameReplayVO
    }

    /// List records by page
    public func listRecords(body: PlusGameRecordQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusGameRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/records/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusGameRecordVO
    }

    /// Settle match
    public func settleMatch(matchId: String) async throws -> PlusApiResultPlusGameMatchVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/matches/\(matchId)/settle"), body: nil)
        return response as? PlusApiResultPlusGameMatchVO
    }

    /// Manage match
    public func manageMatch(matchId: String, body: PlusGameMatchManageForm? = nil) async throws -> PlusApiResultPlusGameMatchVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/matches/\(matchId)/manage"), body: body)
        return response as? PlusApiResultPlusGameMatchVO
    }

    /// Start match
    public func startMatch(body: PlusGameStartMatchForm) async throws -> PlusApiResultPlusGameMatchVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/matches/start"), body: body)
        return response as? PlusApiResultPlusGameMatchVO
    }

    /// List matches by page
    public func listMatches(body: PlusGameMatchQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusGameMatchVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/matches/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusGameMatchVO
    }

    /// List leaderboard entries by page
    public func listLeaderboardEntries(leaderboardId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusGameLeaderboardEntryVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/leaderboards/\(leaderboardId)/entries/list"), body: nil, params: params)
        return response as? PlusApiResultPagePlusGameLeaderboardEntryVO
    }

    /// List leaderboards by page
    public func listLeaderboards(body: PlusGameLeaderboardQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusGameLeaderboardVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/leaderboards/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusGameLeaderboardVO
    }

    /// List user honors
    public func listHonors(body: PlusGameHonorQueryForm) async throws -> PlusApiResultListPlusGameHonorVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/honors/list"), body: body)
        return response as? PlusApiResultListPlusGameHonorVO
    }

    /// List growth reward claims
    public func listGrowthRewardClaims(body: PlusGameGrowthRewardClaimQueryForm? = nil) async throws -> PlusApiResultListPlusGameGrowthRewardClaimVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/growth/reward-claims/list"), body: body)
        return response as? PlusApiResultListPlusGameGrowthRewardClaimVO
    }

    /// List growth records by page
    public func listGrowthRecords(body: PlusGameGrowthRecordQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusGameGrowthRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/growth/records/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusGameGrowthRecordVO
    }

    /// List growth level configs by page
    public func listGrowthLevelConfigs(body: PlusGameGrowthLevelConfigQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusGameGrowthLevelConfigVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/growth/level-configs/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusGameGrowthLevelConfigVO
    }

    /// Refresh growth account
    public func refreshGrowthAccount(body: PlusGameGrowthAccountRefreshForm) async throws -> PlusApiResultPlusGameGrowthAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/growth/accounts/refresh"), body: body)
        return response as? PlusApiResultPlusGameGrowthAccountVO
    }

    /// List growth accounts by page
    public func listGrowthAccounts(body: PlusGameGrowthAccountQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusGameGrowthAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/growth/accounts/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusGameGrowthAccountVO
    }

    /// List game definitions by page
    public func listByPage(body: PlusGameDefinitionQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusGameDefinitionVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/definition/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusGameDefinitionVO
    }

    /// List all game definitions
    public func listAll(body: PlusGameDefinitionQueryForm? = nil) async throws -> PlusApiResultListPlusGameDefinitionVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/definition/list/all"), body: body)
        return response as? PlusApiResultListPlusGameDefinitionVO
    }

    /// Manage challenge
    public func manageChallenge(challengeId: String, body: PlusGameChallengeManageForm? = nil) async throws -> PlusApiResultPlusGameChallengeVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/challenges/\(challengeId)/manage"), body: body)
        return response as? PlusApiResultPlusGameChallengeVO
    }

    /// List challenges by page
    public func listChallenges(body: PlusGameChallengeQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusGameChallengeVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/challenges/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusGameChallengeVO
    }

    /// Create challenge
    public func createChallenge(body: PlusGameChallengeCreateForm? = nil) async throws -> PlusApiResultPlusGameChallengeVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/challenges/create"), body: body)
        return response as? PlusApiResultPlusGameChallengeVO
    }

    /// Manage arena
    public func manageArena(arenaId: String, body: PlusGameArenaManageForm? = nil) async throws -> PlusApiResultPlusGameArenaVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/arenas/\(arenaId)/manage"), body: body)
        return response as? PlusApiResultPlusGameArenaVO
    }

    /// Open arena
    public func openArena(body: PlusGameArenaManageForm? = nil) async throws -> PlusApiResultPlusGameArenaVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/arenas/open"), body: body)
        return response as? PlusApiResultPlusGameArenaVO
    }

    /// List arenas by page
    public func listArenas(body: PlusGameArenaQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusGameArenaVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/arenas/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusGameArenaVO
    }

    /// List action records by page
    public func listActions(body: PlusGameActionRecordQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusGameActionRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/game/actions/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusGameActionRecordVO
    }

    /// Get tournament detail
    public func getTournament(tournamentId: String) async throws -> PlusApiResultPlusGameTournamentVO? {
        let response = try await client.get(ApiPaths.backendPath("/game/tournaments/\(tournamentId)"))
        return response as? PlusApiResultPlusGameTournamentVO
    }

    /// Get tournament player detail
    public func getTournamentPlayer(tournamentId: String, userId: String) async throws -> PlusApiResultPlusGameTournamentPlayerVO? {
        let response = try await client.get(ApiPaths.backendPath("/game/tournaments/\(tournamentId)/players/\(userId)"))
        return response as? PlusApiResultPlusGameTournamentPlayerVO
    }

    /// Get score record detail
    public func getScoreRecord(recordId: String) async throws -> PlusApiResultPlusGameScoreRecordVO? {
        let response = try await client.get(ApiPaths.backendPath("/game/score-records/\(recordId)"))
        return response as? PlusApiResultPlusGameScoreRecordVO
    }

    /// Get room detail
    public func getRoom(roomId: String) async throws -> PlusApiResultPlusGameRoomVO? {
        let response = try await client.get(ApiPaths.backendPath("/game/rooms/\(roomId)"))
        return response as? PlusApiResultPlusGameRoomVO
    }

    /// Get room seat detail
    public func getRoomSeat(roomId: String, seatNo: String) async throws -> PlusApiResultPlusGameRoomSeatVO? {
        let response = try await client.get(ApiPaths.backendPath("/game/rooms/\(roomId)/seats/\(seatNo)"))
        return response as? PlusApiResultPlusGameRoomSeatVO
    }

    /// Get replay detail
    public func getReplay(replayId: String) async throws -> PlusApiResultPlusGameReplayVO? {
        let response = try await client.get(ApiPaths.backendPath("/game/replays/\(replayId)"))
        return response as? PlusApiResultPlusGameReplayVO
    }

    /// Get replay by match
    public func getReplayByMatch(matchId: String) async throws -> PlusApiResultPlusGameReplayVO? {
        let response = try await client.get(ApiPaths.backendPath("/game/replays/match/\(matchId)"))
        return response as? PlusApiResultPlusGameReplayVO
    }

    /// Get match record by user
    public func getRecord(matchId: String, userId: String) async throws -> PlusApiResultPlusGameRecordVO? {
        let response = try await client.get(ApiPaths.backendPath("/game/records/matches/\(matchId)/users/\(userId)"))
        return response as? PlusApiResultPlusGameRecordVO
    }

    /// Get match detail
    public func getMatch(matchId: String) async throws -> PlusApiResultPlusGameMatchVO? {
        let response = try await client.get(ApiPaths.backendPath("/game/matches/\(matchId)"))
        return response as? PlusApiResultPlusGameMatchVO
    }

    /// Get leaderboard detail
    public func getLeaderboard(leaderboardId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPlusGameLeaderboardVO? {
        let response = try await client.get(ApiPaths.backendPath("/game/leaderboards/\(leaderboardId)"), params: params)
        return response as? PlusApiResultPlusGameLeaderboardVO
    }

    /// Get leaderboard entry by user
    public func getLeaderboardEntry(leaderboardId: String, userId: String) async throws -> PlusApiResultPlusGameLeaderboardEntryVO? {
        let response = try await client.get(ApiPaths.backendPath("/game/leaderboards/\(leaderboardId)/entries/\(userId)"))
        return response as? PlusApiResultPlusGameLeaderboardEntryVO
    }

    /// Get growth record detail
    public func getGrowthRecord(recordId: String) async throws -> PlusApiResultPlusGameGrowthRecordVO? {
        let response = try await client.get(ApiPaths.backendPath("/game/growth/records/\(recordId)"))
        return response as? PlusApiResultPlusGameGrowthRecordVO
    }

    /// Get growth level config detail
    public func getGrowthLevelConfig(configId: String) async throws -> PlusApiResultPlusGameGrowthLevelConfigVO? {
        let response = try await client.get(ApiPaths.backendPath("/game/growth/level-configs/\(configId)"))
        return response as? PlusApiResultPlusGameGrowthLevelConfigVO
    }

    /// Get growth account detail
    public func getGrowthAccount(accountId: String) async throws -> PlusApiResultPlusGameGrowthAccountVO? {
        let response = try await client.get(ApiPaths.backendPath("/game/growth/accounts/\(accountId)"))
        return response as? PlusApiResultPlusGameGrowthAccountVO
    }

    /// List growth reward claims by account
    public func listGrowthRewardClaimsByAccount(accountId: String) async throws -> PlusApiResultListPlusGameGrowthRewardClaimVO? {
        let response = try await client.get(ApiPaths.backendPath("/game/growth/accounts/\(accountId)/reward-claims"))
        return response as? PlusApiResultListPlusGameGrowthRewardClaimVO
    }

    /// Get game definition
    public func getById(id: String) async throws -> PlusApiResultPlusGameDefinitionVO? {
        let response = try await client.get(ApiPaths.backendPath("/game/definition/\(id)"))
        return response as? PlusApiResultPlusGameDefinitionVO
    }

    /// Delete game definition
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/game/definition/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get challenge detail
    public func getChallenge(challengeId: String) async throws -> PlusApiResultPlusGameChallengeVO? {
        let response = try await client.get(ApiPaths.backendPath("/game/challenges/\(challengeId)"))
        return response as? PlusApiResultPlusGameChallengeVO
    }

    /// Get arena detail
    public func getArena(arenaId: String) async throws -> PlusApiResultPlusGameArenaVO? {
        let response = try await client.get(ApiPaths.backendPath("/game/arenas/\(arenaId)"))
        return response as? PlusApiResultPlusGameArenaVO
    }

    /// Get action record detail
    public func getAction(actionId: String) async throws -> PlusApiResultPlusGameActionRecordVO? {
        let response = try await client.get(ApiPaths.backendPath("/game/actions/\(actionId)"))
        return response as? PlusApiResultPlusGameActionRecordVO
    }
}
