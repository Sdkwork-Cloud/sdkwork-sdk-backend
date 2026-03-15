import '../http/client.dart';
import '../models.dart';

class GameApi {
  final HttpClient _client;
  
  GameApi(this._client);

  /// Update game definition
  Future<PlusApiResultPlusGameDefinitionVO?> update(PlusGameDefinitionForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/game/definition'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusGameDefinitionVO ? response : null;
  }

  /// Create game definition
  Future<PlusApiResultPlusGameDefinitionVO?> create(PlusGameDefinitionForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/definition'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusGameDefinitionVO ? response : null;
  }

  /// Register tournament
  Future<PlusApiResultBoolean?> registerTournament(String tournamentId, PlusGameTournamentRegistrationForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/tournaments/${tournamentId}/register'), body: body, contentType: 'application/json');
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Manage tournament player
  Future<PlusApiResultPlusGameTournamentPlayerVO?> manageTournamentPlayer(String tournamentId, String userId, PlusGameTournamentPlayerManageForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/tournaments/${tournamentId}/players/${userId}/manage'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusGameTournamentPlayerVO ? response : null;
  }

  /// List tournament players by page
  Future<PlusApiResultPagePlusGameTournamentPlayerVO?> listTournamentPlayers(String tournamentId, PlusGameTournamentPlayerQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/game/tournaments/${tournamentId}/players/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusGameTournamentPlayerVO ? response : null;
  }

  /// Batch update tournament player status
  Future<PlusApiResultListPlusGameTournamentPlayerVO?> batchUpdateTournamentPlayerStatus(String tournamentId, PlusGameTournamentBatchStatusForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/tournaments/${tournamentId}/players/batch_status'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusGameTournamentPlayerVO ? response : null;
  }

  /// Batch finish tournament players
  Future<PlusApiResultListPlusGameTournamentPlayerVO?> batchFinishTournamentPlayers(String tournamentId, PlusGameTournamentBatchStatusForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/tournaments/${tournamentId}/players/batch_finish'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusGameTournamentPlayerVO ? response : null;
  }

  /// Batch eliminate tournament players
  Future<PlusApiResultListPlusGameTournamentPlayerVO?> batchEliminateTournamentPlayers(String tournamentId, PlusGameTournamentBatchStatusForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/tournaments/${tournamentId}/players/batch_eliminate'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusGameTournamentPlayerVO ? response : null;
  }

  /// Batch check in tournament players
  Future<PlusApiResultListPlusGameTournamentPlayerVO?> batchCheckInTournamentPlayers(String tournamentId, PlusGameTournamentBatchStatusForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/tournaments/${tournamentId}/players/batch_check_in'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusGameTournamentPlayerVO ? response : null;
  }

  /// Batch arrange tournament players
  Future<PlusApiResultListPlusGameTournamentPlayerVO?> batchArrangeTournamentPlayers(String tournamentId, PlusGameTournamentBatchArrangeForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/tournaments/${tournamentId}/players/batch_arrange'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusGameTournamentPlayerVO ? response : null;
  }

  /// Batch advance tournament players
  Future<PlusApiResultListPlusGameTournamentPlayerVO?> batchAdvanceTournamentPlayers(String tournamentId, PlusGameTournamentBatchStatusForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/tournaments/${tournamentId}/players/batch_advance'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusGameTournamentPlayerVO ? response : null;
  }

  /// Manage tournament
  Future<PlusApiResultPlusGameTournamentVO?> manageTournament(String tournamentId, PlusGameTournamentManageForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/tournaments/${tournamentId}/manage'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusGameTournamentVO ? response : null;
  }

  /// Cancel tournament registration
  Future<PlusApiResultBoolean?> cancelTournamentRegistration(String tournamentId, PlusGameTournamentRegistrationForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/tournaments/${tournamentId}/cancel_registration'), body: body, contentType: 'application/json');
    return response is PlusApiResultBoolean ? response : null;
  }

  /// List tournaments by page
  Future<PlusApiResultPagePlusGameTournamentVO?> listTournaments(PlusGameTournamentQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/game/tournaments/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusGameTournamentVO ? response : null;
  }

  /// Refresh player stats
  Future<PlusApiResultPlusGameStatsVO?> refreshStats(PlusGameStatsQueryForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/stats/refresh'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusGameStatsVO ? response : null;
  }

  /// Get player stats
  Future<PlusApiResultPlusGameStatsVO?> getStats(PlusGameStatsQueryForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/stats/get'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusGameStatsVO ? response : null;
  }

  /// List score records by page
  Future<PlusApiResultPagePlusGameScoreRecordVO?> listScoreRecords(PlusGameScoreRecordQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/game/score-records/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusGameScoreRecordVO ? response : null;
  }

  /// Manage room seat
  Future<PlusApiResultPlusGameRoomSeatVO?> manageRoomSeat(String roomId, String seatNo, PlusGameRoomSeatManageForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/rooms/${roomId}/seats/${seatNo}/manage'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusGameRoomSeatVO ? response : null;
  }

  /// List room seats by page
  Future<PlusApiResultPagePlusGameRoomSeatVO?> listRoomSeats(String roomId, PlusGameRoomSeatQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/game/rooms/${roomId}/seats/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusGameRoomSeatVO ? response : null;
  }

  /// Dismiss room
  Future<PlusApiResultPlusGameRoomVO?> dismissRoom(String roomId, PlusGameDismissRoomForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/rooms/${roomId}/dismiss'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusGameRoomVO ? response : null;
  }

  /// List rooms by page
  Future<PlusApiResultPagePlusGameRoomVO?> listRooms(PlusGameRoomQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/game/rooms/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusGameRoomVO ? response : null;
  }

  /// Manage replay
  Future<PlusApiResultPlusGameReplayVO?> manageReplay(String replayId, PlusGameReplayManageForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/replays/${replayId}/manage'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusGameReplayVO ? response : null;
  }

  /// List replays by page
  Future<PlusApiResultPagePlusGameReplayVO?> listReplays(PlusGameReplayQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/game/replays/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusGameReplayVO ? response : null;
  }

  /// List records by page
  Future<PlusApiResultPagePlusGameRecordVO?> listRecords(PlusGameRecordQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/game/records/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusGameRecordVO ? response : null;
  }

  /// Settle match
  Future<PlusApiResultPlusGameMatchVO?> settleMatch(String matchId) async {
    final response = await _client.post(ApiPaths.backendPath('/game/matches/${matchId}/settle'));
    return response is PlusApiResultPlusGameMatchVO ? response : null;
  }

  /// Manage match
  Future<PlusApiResultPlusGameMatchVO?> manageMatch(String matchId, PlusGameMatchManageForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/matches/${matchId}/manage'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusGameMatchVO ? response : null;
  }

  /// Start match
  Future<PlusApiResultPlusGameMatchVO?> startMatch(PlusGameStartMatchForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/matches/start'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusGameMatchVO ? response : null;
  }

  /// List matches by page
  Future<PlusApiResultPagePlusGameMatchVO?> listMatches(PlusGameMatchQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/game/matches/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusGameMatchVO ? response : null;
  }

  /// List leaderboard entries by page
  Future<PlusApiResultPagePlusGameLeaderboardEntryVO?> listLeaderboardEntries(String leaderboardId, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/game/leaderboards/${leaderboardId}/entries/list'), params: params);
    return response is PlusApiResultPagePlusGameLeaderboardEntryVO ? response : null;
  }

  /// List leaderboards by page
  Future<PlusApiResultPagePlusGameLeaderboardVO?> listLeaderboards(PlusGameLeaderboardQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/game/leaderboards/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusGameLeaderboardVO ? response : null;
  }

  /// List user honors
  Future<PlusApiResultListPlusGameHonorVO?> listHonors(PlusGameHonorQueryForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/honors/list'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusGameHonorVO ? response : null;
  }

  /// List growth reward claims
  Future<PlusApiResultListPlusGameGrowthRewardClaimVO?> listGrowthRewardClaims(PlusGameGrowthRewardClaimQueryForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/growth/reward-claims/list'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusGameGrowthRewardClaimVO ? response : null;
  }

  /// List growth records by page
  Future<PlusApiResultPagePlusGameGrowthRecordVO?> listGrowthRecords(PlusGameGrowthRecordQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/game/growth/records/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusGameGrowthRecordVO ? response : null;
  }

  /// List growth level configs by page
  Future<PlusApiResultPagePlusGameGrowthLevelConfigVO?> listGrowthLevelConfigs(PlusGameGrowthLevelConfigQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/game/growth/level-configs/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusGameGrowthLevelConfigVO ? response : null;
  }

  /// Refresh growth account
  Future<PlusApiResultPlusGameGrowthAccountVO?> refreshGrowthAccount(PlusGameGrowthAccountRefreshForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/growth/accounts/refresh'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusGameGrowthAccountVO ? response : null;
  }

  /// List growth accounts by page
  Future<PlusApiResultPagePlusGameGrowthAccountVO?> listGrowthAccounts(PlusGameGrowthAccountQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/game/growth/accounts/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusGameGrowthAccountVO ? response : null;
  }

  /// List game definitions by page
  Future<PlusApiResultPagePlusGameDefinitionVO?> listByPage(PlusGameDefinitionQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/game/definition/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusGameDefinitionVO ? response : null;
  }

  /// List all game definitions
  Future<PlusApiResultListPlusGameDefinitionVO?> listAll(PlusGameDefinitionQueryForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/definition/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusGameDefinitionVO ? response : null;
  }

  /// Manage challenge
  Future<PlusApiResultPlusGameChallengeVO?> manageChallenge(String challengeId, PlusGameChallengeManageForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/challenges/${challengeId}/manage'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusGameChallengeVO ? response : null;
  }

  /// List challenges by page
  Future<PlusApiResultPagePlusGameChallengeVO?> listChallenges(PlusGameChallengeQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/game/challenges/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusGameChallengeVO ? response : null;
  }

  /// Create challenge
  Future<PlusApiResultPlusGameChallengeVO?> createChallenge(PlusGameChallengeCreateForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/challenges/create'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusGameChallengeVO ? response : null;
  }

  /// Manage arena
  Future<PlusApiResultPlusGameArenaVO?> manageArena(String arenaId, PlusGameArenaManageForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/arenas/${arenaId}/manage'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusGameArenaVO ? response : null;
  }

  /// Open arena
  Future<PlusApiResultPlusGameArenaVO?> openArena(PlusGameArenaManageForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/game/arenas/open'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusGameArenaVO ? response : null;
  }

  /// List arenas by page
  Future<PlusApiResultPagePlusGameArenaVO?> listArenas(PlusGameArenaQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/game/arenas/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusGameArenaVO ? response : null;
  }

  /// List action records by page
  Future<PlusApiResultPagePlusGameActionRecordVO?> listActions(PlusGameActionRecordQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/game/actions/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusGameActionRecordVO ? response : null;
  }

  /// Get tournament detail
  Future<PlusApiResultPlusGameTournamentVO?> getTournament(String tournamentId) async {
    final response = await _client.get(ApiPaths.backendPath('/game/tournaments/${tournamentId}'));
    return response is PlusApiResultPlusGameTournamentVO ? response : null;
  }

  /// Get tournament player detail
  Future<PlusApiResultPlusGameTournamentPlayerVO?> getTournamentPlayer(String tournamentId, String userId) async {
    final response = await _client.get(ApiPaths.backendPath('/game/tournaments/${tournamentId}/players/${userId}'));
    return response is PlusApiResultPlusGameTournamentPlayerVO ? response : null;
  }

  /// Get score record detail
  Future<PlusApiResultPlusGameScoreRecordVO?> getScoreRecord(String recordId) async {
    final response = await _client.get(ApiPaths.backendPath('/game/score-records/${recordId}'));
    return response is PlusApiResultPlusGameScoreRecordVO ? response : null;
  }

  /// Get room detail
  Future<PlusApiResultPlusGameRoomVO?> getRoom(String roomId) async {
    final response = await _client.get(ApiPaths.backendPath('/game/rooms/${roomId}'));
    return response is PlusApiResultPlusGameRoomVO ? response : null;
  }

  /// Get room seat detail
  Future<PlusApiResultPlusGameRoomSeatVO?> getRoomSeat(String roomId, String seatNo) async {
    final response = await _client.get(ApiPaths.backendPath('/game/rooms/${roomId}/seats/${seatNo}'));
    return response is PlusApiResultPlusGameRoomSeatVO ? response : null;
  }

  /// Get replay detail
  Future<PlusApiResultPlusGameReplayVO?> getReplay(String replayId) async {
    final response = await _client.get(ApiPaths.backendPath('/game/replays/${replayId}'));
    return response is PlusApiResultPlusGameReplayVO ? response : null;
  }

  /// Get replay by match
  Future<PlusApiResultPlusGameReplayVO?> getReplayByMatch(String matchId) async {
    final response = await _client.get(ApiPaths.backendPath('/game/replays/match/${matchId}'));
    return response is PlusApiResultPlusGameReplayVO ? response : null;
  }

  /// Get match record by user
  Future<PlusApiResultPlusGameRecordVO?> getRecord(String matchId, String userId) async {
    final response = await _client.get(ApiPaths.backendPath('/game/records/matches/${matchId}/users/${userId}'));
    return response is PlusApiResultPlusGameRecordVO ? response : null;
  }

  /// Get match detail
  Future<PlusApiResultPlusGameMatchVO?> getMatch(String matchId) async {
    final response = await _client.get(ApiPaths.backendPath('/game/matches/${matchId}'));
    return response is PlusApiResultPlusGameMatchVO ? response : null;
  }

  /// Get leaderboard detail
  Future<PlusApiResultPlusGameLeaderboardVO?> getLeaderboard(String leaderboardId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.backendPath('/game/leaderboards/${leaderboardId}'), params: params);
    return response is PlusApiResultPlusGameLeaderboardVO ? response : null;
  }

  /// Get leaderboard entry by user
  Future<PlusApiResultPlusGameLeaderboardEntryVO?> getLeaderboardEntry(String leaderboardId, String userId) async {
    final response = await _client.get(ApiPaths.backendPath('/game/leaderboards/${leaderboardId}/entries/${userId}'));
    return response is PlusApiResultPlusGameLeaderboardEntryVO ? response : null;
  }

  /// Get growth record detail
  Future<PlusApiResultPlusGameGrowthRecordVO?> getGrowthRecord(String recordId) async {
    final response = await _client.get(ApiPaths.backendPath('/game/growth/records/${recordId}'));
    return response is PlusApiResultPlusGameGrowthRecordVO ? response : null;
  }

  /// Get growth level config detail
  Future<PlusApiResultPlusGameGrowthLevelConfigVO?> getGrowthLevelConfig(String configId) async {
    final response = await _client.get(ApiPaths.backendPath('/game/growth/level-configs/${configId}'));
    return response is PlusApiResultPlusGameGrowthLevelConfigVO ? response : null;
  }

  /// Get growth account detail
  Future<PlusApiResultPlusGameGrowthAccountVO?> getGrowthAccount(String accountId) async {
    final response = await _client.get(ApiPaths.backendPath('/game/growth/accounts/${accountId}'));
    return response is PlusApiResultPlusGameGrowthAccountVO ? response : null;
  }

  /// List growth reward claims by account
  Future<PlusApiResultListPlusGameGrowthRewardClaimVO?> listGrowthRewardClaimsByAccount(String accountId) async {
    final response = await _client.get(ApiPaths.backendPath('/game/growth/accounts/${accountId}/reward-claims'));
    return response is PlusApiResultListPlusGameGrowthRewardClaimVO ? response : null;
  }

  /// Get game definition
  Future<PlusApiResultPlusGameDefinitionVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/game/definition/${id}'));
    return response is PlusApiResultPlusGameDefinitionVO ? response : null;
  }

  /// Delete game definition
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/game/definition/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get challenge detail
  Future<PlusApiResultPlusGameChallengeVO?> getChallenge(String challengeId) async {
    final response = await _client.get(ApiPaths.backendPath('/game/challenges/${challengeId}'));
    return response is PlusApiResultPlusGameChallengeVO ? response : null;
  }

  /// Get arena detail
  Future<PlusApiResultPlusGameArenaVO?> getArena(String arenaId) async {
    final response = await _client.get(ApiPaths.backendPath('/game/arenas/${arenaId}'));
    return response is PlusApiResultPlusGameArenaVO ? response : null;
  }

  /// Get action record detail
  Future<PlusApiResultPlusGameActionRecordVO?> getAction(String actionId) async {
    final response = await _client.get(ApiPaths.backendPath('/game/actions/${actionId}'));
    return response is PlusApiResultPlusGameActionRecordVO ? response : null;
  }
}
