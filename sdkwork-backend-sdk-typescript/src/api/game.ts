import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusGameDefinitionVO, PlusApiResultListPlusGameGrowthRewardClaimVO, PlusApiResultListPlusGameHonorVO, PlusApiResultListPlusGameTournamentPlayerVO, PlusApiResultPagePlusGameActionRecordVO, PlusApiResultPagePlusGameArenaVO, PlusApiResultPagePlusGameChallengeVO, PlusApiResultPagePlusGameDefinitionVO, PlusApiResultPagePlusGameGrowthAccountVO, PlusApiResultPagePlusGameGrowthLevelConfigVO, PlusApiResultPagePlusGameGrowthRecordVO, PlusApiResultPagePlusGameLeaderboardEntryVO, PlusApiResultPagePlusGameLeaderboardVO, PlusApiResultPagePlusGameMatchVO, PlusApiResultPagePlusGameRecordVO, PlusApiResultPagePlusGameReplayVO, PlusApiResultPagePlusGameRoomSeatVO, PlusApiResultPagePlusGameRoomVO, PlusApiResultPagePlusGameScoreRecordVO, PlusApiResultPagePlusGameTournamentPlayerVO, PlusApiResultPagePlusGameTournamentVO, PlusApiResultPlusGameActionRecordVO, PlusApiResultPlusGameArenaVO, PlusApiResultPlusGameChallengeVO, PlusApiResultPlusGameDefinitionVO, PlusApiResultPlusGameGrowthAccountVO, PlusApiResultPlusGameGrowthLevelConfigVO, PlusApiResultPlusGameGrowthRecordVO, PlusApiResultPlusGameLeaderboardEntryVO, PlusApiResultPlusGameLeaderboardVO, PlusApiResultPlusGameMatchVO, PlusApiResultPlusGameRecordVO, PlusApiResultPlusGameReplayVO, PlusApiResultPlusGameRoomSeatVO, PlusApiResultPlusGameRoomVO, PlusApiResultPlusGameScoreRecordVO, PlusApiResultPlusGameStatsVO, PlusApiResultPlusGameTournamentPlayerVO, PlusApiResultPlusGameTournamentVO, PlusGameActionRecordQueryForm, PlusGameArenaManageForm, PlusGameArenaQueryForm, PlusGameChallengeCreateForm, PlusGameChallengeManageForm, PlusGameChallengeQueryForm, PlusGameDefinitionForm, PlusGameDefinitionQueryForm, PlusGameDismissRoomForm, PlusGameGrowthAccountQueryForm, PlusGameGrowthAccountRefreshForm, PlusGameGrowthLevelConfigQueryForm, PlusGameGrowthRecordQueryForm, PlusGameGrowthRewardClaimQueryForm, PlusGameHonorQueryForm, PlusGameLeaderboardQueryForm, PlusGameMatchManageForm, PlusGameMatchQueryForm, PlusGameRecordQueryForm, PlusGameReplayManageForm, PlusGameReplayQueryForm, PlusGameRoomQueryForm, PlusGameRoomSeatManageForm, PlusGameRoomSeatQueryForm, PlusGameScoreRecordQueryForm, PlusGameStartMatchForm, PlusGameStatsQueryForm, PlusGameTournamentBatchArrangeForm, PlusGameTournamentBatchStatusForm, PlusGameTournamentManageForm, PlusGameTournamentPlayerManageForm, PlusGameTournamentPlayerQueryForm, PlusGameTournamentQueryForm, PlusGameTournamentRegistrationForm } from '../types';


export class GameApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update game definition */
  async update(body: PlusGameDefinitionForm): Promise<PlusApiResultPlusGameDefinitionVO> {
    return this.client.put<PlusApiResultPlusGameDefinitionVO>(backendApiPath(`/game/definition`), body);
  }

/** Create game definition */
  async create(body: PlusGameDefinitionForm): Promise<PlusApiResultPlusGameDefinitionVO> {
    return this.client.post<PlusApiResultPlusGameDefinitionVO>(backendApiPath(`/game/definition`), body);
  }

/** Register tournament */
  async registerTournament(tournamentId: string | number, body: PlusGameTournamentRegistrationForm): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/game/tournaments/${tournamentId}/register`), body);
  }

/** Manage tournament player */
  async manageTournamentPlayer(tournamentId: string | number, userId: string | number, body?: PlusGameTournamentPlayerManageForm): Promise<PlusApiResultPlusGameTournamentPlayerVO> {
    return this.client.post<PlusApiResultPlusGameTournamentPlayerVO>(backendApiPath(`/game/tournaments/${tournamentId}/players/${userId}/manage`), body);
  }

/** List tournament players by page */
  async listTournamentPlayers(tournamentId: string | number, body?: PlusGameTournamentPlayerQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusGameTournamentPlayerVO> {
    return this.client.post<PlusApiResultPagePlusGameTournamentPlayerVO>(backendApiPath(`/game/tournaments/${tournamentId}/players/list`), body, params);
  }

/** Batch update tournament player status */
  async batchUpdateTournamentPlayerStatus(tournamentId: string | number, body?: PlusGameTournamentBatchStatusForm): Promise<PlusApiResultListPlusGameTournamentPlayerVO> {
    return this.client.post<PlusApiResultListPlusGameTournamentPlayerVO>(backendApiPath(`/game/tournaments/${tournamentId}/players/batch_status`), body);
  }

/** Batch finish tournament players */
  async batchFinishTournamentPlayers(tournamentId: string | number, body?: PlusGameTournamentBatchStatusForm): Promise<PlusApiResultListPlusGameTournamentPlayerVO> {
    return this.client.post<PlusApiResultListPlusGameTournamentPlayerVO>(backendApiPath(`/game/tournaments/${tournamentId}/players/batch_finish`), body);
  }

/** Batch eliminate tournament players */
  async batchEliminateTournamentPlayers(tournamentId: string | number, body?: PlusGameTournamentBatchStatusForm): Promise<PlusApiResultListPlusGameTournamentPlayerVO> {
    return this.client.post<PlusApiResultListPlusGameTournamentPlayerVO>(backendApiPath(`/game/tournaments/${tournamentId}/players/batch_eliminate`), body);
  }

/** Batch check in tournament players */
  async batchCheckInTournamentPlayers(tournamentId: string | number, body?: PlusGameTournamentBatchStatusForm): Promise<PlusApiResultListPlusGameTournamentPlayerVO> {
    return this.client.post<PlusApiResultListPlusGameTournamentPlayerVO>(backendApiPath(`/game/tournaments/${tournamentId}/players/batch_check_in`), body);
  }

/** Batch arrange tournament players */
  async batchArrangeTournamentPlayers(tournamentId: string | number, body?: PlusGameTournamentBatchArrangeForm): Promise<PlusApiResultListPlusGameTournamentPlayerVO> {
    return this.client.post<PlusApiResultListPlusGameTournamentPlayerVO>(backendApiPath(`/game/tournaments/${tournamentId}/players/batch_arrange`), body);
  }

/** Batch advance tournament players */
  async batchAdvanceTournamentPlayers(tournamentId: string | number, body?: PlusGameTournamentBatchStatusForm): Promise<PlusApiResultListPlusGameTournamentPlayerVO> {
    return this.client.post<PlusApiResultListPlusGameTournamentPlayerVO>(backendApiPath(`/game/tournaments/${tournamentId}/players/batch_advance`), body);
  }

/** Manage tournament */
  async manageTournament(tournamentId: string | number, body?: PlusGameTournamentManageForm): Promise<PlusApiResultPlusGameTournamentVO> {
    return this.client.post<PlusApiResultPlusGameTournamentVO>(backendApiPath(`/game/tournaments/${tournamentId}/manage`), body);
  }

/** Cancel tournament registration */
  async cancelTournamentRegistration(tournamentId: string | number, body: PlusGameTournamentRegistrationForm): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/game/tournaments/${tournamentId}/cancel_registration`), body);
  }

/** List tournaments by page */
  async listTournaments(body?: PlusGameTournamentQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusGameTournamentVO> {
    return this.client.post<PlusApiResultPagePlusGameTournamentVO>(backendApiPath(`/game/tournaments/list`), body, params);
  }

/** Refresh player stats */
  async refreshStats(body: PlusGameStatsQueryForm): Promise<PlusApiResultPlusGameStatsVO> {
    return this.client.post<PlusApiResultPlusGameStatsVO>(backendApiPath(`/game/stats/refresh`), body);
  }

/** Get player stats */
  async getStats(body: PlusGameStatsQueryForm): Promise<PlusApiResultPlusGameStatsVO> {
    return this.client.post<PlusApiResultPlusGameStatsVO>(backendApiPath(`/game/stats/get`), body);
  }

/** List score records by page */
  async listScoreRecords(body?: PlusGameScoreRecordQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusGameScoreRecordVO> {
    return this.client.post<PlusApiResultPagePlusGameScoreRecordVO>(backendApiPath(`/game/score-records/list`), body, params);
  }

/** Manage room seat */
  async manageRoomSeat(roomId: string | number, seatNo: string | number, body?: PlusGameRoomSeatManageForm): Promise<PlusApiResultPlusGameRoomSeatVO> {
    return this.client.post<PlusApiResultPlusGameRoomSeatVO>(backendApiPath(`/game/rooms/${roomId}/seats/${seatNo}/manage`), body);
  }

/** List room seats by page */
  async listRoomSeats(roomId: string | number, body?: PlusGameRoomSeatQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusGameRoomSeatVO> {
    return this.client.post<PlusApiResultPagePlusGameRoomSeatVO>(backendApiPath(`/game/rooms/${roomId}/seats/list`), body, params);
  }

/** Dismiss room */
  async dismissRoom(roomId: string | number, body?: PlusGameDismissRoomForm): Promise<PlusApiResultPlusGameRoomVO> {
    return this.client.post<PlusApiResultPlusGameRoomVO>(backendApiPath(`/game/rooms/${roomId}/dismiss`), body);
  }

/** List rooms by page */
  async listRooms(body?: PlusGameRoomQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusGameRoomVO> {
    return this.client.post<PlusApiResultPagePlusGameRoomVO>(backendApiPath(`/game/rooms/list`), body, params);
  }

/** Manage replay */
  async manageReplay(replayId: string | number, body?: PlusGameReplayManageForm): Promise<PlusApiResultPlusGameReplayVO> {
    return this.client.post<PlusApiResultPlusGameReplayVO>(backendApiPath(`/game/replays/${replayId}/manage`), body);
  }

/** List replays by page */
  async listReplays(body?: PlusGameReplayQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusGameReplayVO> {
    return this.client.post<PlusApiResultPagePlusGameReplayVO>(backendApiPath(`/game/replays/list`), body, params);
  }

/** List records by page */
  async listRecords(body?: PlusGameRecordQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusGameRecordVO> {
    return this.client.post<PlusApiResultPagePlusGameRecordVO>(backendApiPath(`/game/records/list`), body, params);
  }

/** Settle match */
  async settleMatch(matchId: string | number): Promise<PlusApiResultPlusGameMatchVO> {
    return this.client.post<PlusApiResultPlusGameMatchVO>(backendApiPath(`/game/matches/${matchId}/settle`));
  }

/** Manage match */
  async manageMatch(matchId: string | number, body?: PlusGameMatchManageForm): Promise<PlusApiResultPlusGameMatchVO> {
    return this.client.post<PlusApiResultPlusGameMatchVO>(backendApiPath(`/game/matches/${matchId}/manage`), body);
  }

/** Start match */
  async startMatch(body: PlusGameStartMatchForm): Promise<PlusApiResultPlusGameMatchVO> {
    return this.client.post<PlusApiResultPlusGameMatchVO>(backendApiPath(`/game/matches/start`), body);
  }

/** List matches by page */
  async listMatches(body?: PlusGameMatchQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusGameMatchVO> {
    return this.client.post<PlusApiResultPagePlusGameMatchVO>(backendApiPath(`/game/matches/list`), body, params);
  }

/** List leaderboard entries by page */
  async listLeaderboardEntries(leaderboardId: string | number, params?: QueryParams): Promise<PlusApiResultPagePlusGameLeaderboardEntryVO> {
    return this.client.post<PlusApiResultPagePlusGameLeaderboardEntryVO>(backendApiPath(`/game/leaderboards/${leaderboardId}/entries/list`), undefined, params);
  }

/** List leaderboards by page */
  async listLeaderboards(body?: PlusGameLeaderboardQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusGameLeaderboardVO> {
    return this.client.post<PlusApiResultPagePlusGameLeaderboardVO>(backendApiPath(`/game/leaderboards/list`), body, params);
  }

/** List user honors */
  async listHonors(body: PlusGameHonorQueryForm): Promise<PlusApiResultListPlusGameHonorVO> {
    return this.client.post<PlusApiResultListPlusGameHonorVO>(backendApiPath(`/game/honors/list`), body);
  }

/** List growth reward claims */
  async listGrowthRewardClaims(body?: PlusGameGrowthRewardClaimQueryForm): Promise<PlusApiResultListPlusGameGrowthRewardClaimVO> {
    return this.client.post<PlusApiResultListPlusGameGrowthRewardClaimVO>(backendApiPath(`/game/growth/reward-claims/list`), body);
  }

/** List growth records by page */
  async listGrowthRecords(body?: PlusGameGrowthRecordQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusGameGrowthRecordVO> {
    return this.client.post<PlusApiResultPagePlusGameGrowthRecordVO>(backendApiPath(`/game/growth/records/list`), body, params);
  }

/** List growth level configs by page */
  async listGrowthLevelConfigs(body?: PlusGameGrowthLevelConfigQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusGameGrowthLevelConfigVO> {
    return this.client.post<PlusApiResultPagePlusGameGrowthLevelConfigVO>(backendApiPath(`/game/growth/level-configs/list`), body, params);
  }

/** Refresh growth account */
  async refreshGrowthAccount(body: PlusGameGrowthAccountRefreshForm): Promise<PlusApiResultPlusGameGrowthAccountVO> {
    return this.client.post<PlusApiResultPlusGameGrowthAccountVO>(backendApiPath(`/game/growth/accounts/refresh`), body);
  }

/** List growth accounts by page */
  async listGrowthAccounts(body?: PlusGameGrowthAccountQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusGameGrowthAccountVO> {
    return this.client.post<PlusApiResultPagePlusGameGrowthAccountVO>(backendApiPath(`/game/growth/accounts/list`), body, params);
  }

/** List game definitions by page */
  async listByPage(body?: PlusGameDefinitionQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusGameDefinitionVO> {
    return this.client.post<PlusApiResultPagePlusGameDefinitionVO>(backendApiPath(`/game/definition/list`), body, params);
  }

/** List all game definitions */
  async listAll(body?: PlusGameDefinitionQueryForm): Promise<PlusApiResultListPlusGameDefinitionVO> {
    return this.client.post<PlusApiResultListPlusGameDefinitionVO>(backendApiPath(`/game/definition/list/all`), body);
  }

/** Manage challenge */
  async manageChallenge(challengeId: string | number, body?: PlusGameChallengeManageForm): Promise<PlusApiResultPlusGameChallengeVO> {
    return this.client.post<PlusApiResultPlusGameChallengeVO>(backendApiPath(`/game/challenges/${challengeId}/manage`), body);
  }

/** List challenges by page */
  async listChallenges(body?: PlusGameChallengeQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusGameChallengeVO> {
    return this.client.post<PlusApiResultPagePlusGameChallengeVO>(backendApiPath(`/game/challenges/list`), body, params);
  }

/** Create challenge */
  async createChallenge(body?: PlusGameChallengeCreateForm): Promise<PlusApiResultPlusGameChallengeVO> {
    return this.client.post<PlusApiResultPlusGameChallengeVO>(backendApiPath(`/game/challenges/create`), body);
  }

/** Manage arena */
  async manageArena(arenaId: string | number, body?: PlusGameArenaManageForm): Promise<PlusApiResultPlusGameArenaVO> {
    return this.client.post<PlusApiResultPlusGameArenaVO>(backendApiPath(`/game/arenas/${arenaId}/manage`), body);
  }

/** Open arena */
  async openArena(body?: PlusGameArenaManageForm): Promise<PlusApiResultPlusGameArenaVO> {
    return this.client.post<PlusApiResultPlusGameArenaVO>(backendApiPath(`/game/arenas/open`), body);
  }

/** List arenas by page */
  async listArenas(body?: PlusGameArenaQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusGameArenaVO> {
    return this.client.post<PlusApiResultPagePlusGameArenaVO>(backendApiPath(`/game/arenas/list`), body, params);
  }

/** List action records by page */
  async listActions(body?: PlusGameActionRecordQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusGameActionRecordVO> {
    return this.client.post<PlusApiResultPagePlusGameActionRecordVO>(backendApiPath(`/game/actions/list`), body, params);
  }

/** Get tournament detail */
  async getTournament(tournamentId: string | number): Promise<PlusApiResultPlusGameTournamentVO> {
    return this.client.get<PlusApiResultPlusGameTournamentVO>(backendApiPath(`/game/tournaments/${tournamentId}`));
  }

/** Get tournament player detail */
  async getTournamentPlayer(tournamentId: string | number, userId: string | number): Promise<PlusApiResultPlusGameTournamentPlayerVO> {
    return this.client.get<PlusApiResultPlusGameTournamentPlayerVO>(backendApiPath(`/game/tournaments/${tournamentId}/players/${userId}`));
  }

/** Get score record detail */
  async getScoreRecord(recordId: string | number): Promise<PlusApiResultPlusGameScoreRecordVO> {
    return this.client.get<PlusApiResultPlusGameScoreRecordVO>(backendApiPath(`/game/score-records/${recordId}`));
  }

/** Get room detail */
  async getRoom(roomId: string | number): Promise<PlusApiResultPlusGameRoomVO> {
    return this.client.get<PlusApiResultPlusGameRoomVO>(backendApiPath(`/game/rooms/${roomId}`));
  }

/** Get room seat detail */
  async getRoomSeat(roomId: string | number, seatNo: string | number): Promise<PlusApiResultPlusGameRoomSeatVO> {
    return this.client.get<PlusApiResultPlusGameRoomSeatVO>(backendApiPath(`/game/rooms/${roomId}/seats/${seatNo}`));
  }

/** Get replay detail */
  async getReplay(replayId: string | number): Promise<PlusApiResultPlusGameReplayVO> {
    return this.client.get<PlusApiResultPlusGameReplayVO>(backendApiPath(`/game/replays/${replayId}`));
  }

/** Get replay by match */
  async getReplayByMatch(matchId: string | number): Promise<PlusApiResultPlusGameReplayVO> {
    return this.client.get<PlusApiResultPlusGameReplayVO>(backendApiPath(`/game/replays/match/${matchId}`));
  }

/** Get match record by user */
  async getRecord(matchId: string | number, userId: string | number): Promise<PlusApiResultPlusGameRecordVO> {
    return this.client.get<PlusApiResultPlusGameRecordVO>(backendApiPath(`/game/records/matches/${matchId}/users/${userId}`));
  }

/** Get match detail */
  async getMatch(matchId: string | number): Promise<PlusApiResultPlusGameMatchVO> {
    return this.client.get<PlusApiResultPlusGameMatchVO>(backendApiPath(`/game/matches/${matchId}`));
  }

/** Get leaderboard detail */
  async getLeaderboard(leaderboardId: string | number, params?: QueryParams): Promise<PlusApiResultPlusGameLeaderboardVO> {
    return this.client.get<PlusApiResultPlusGameLeaderboardVO>(backendApiPath(`/game/leaderboards/${leaderboardId}`), params);
  }

/** Get leaderboard entry by user */
  async getLeaderboardEntry(leaderboardId: string | number, userId: string | number): Promise<PlusApiResultPlusGameLeaderboardEntryVO> {
    return this.client.get<PlusApiResultPlusGameLeaderboardEntryVO>(backendApiPath(`/game/leaderboards/${leaderboardId}/entries/${userId}`));
  }

/** Get growth record detail */
  async getGrowthRecord(recordId: string | number): Promise<PlusApiResultPlusGameGrowthRecordVO> {
    return this.client.get<PlusApiResultPlusGameGrowthRecordVO>(backendApiPath(`/game/growth/records/${recordId}`));
  }

/** Get growth level config detail */
  async getGrowthLevelConfig(configId: string | number): Promise<PlusApiResultPlusGameGrowthLevelConfigVO> {
    return this.client.get<PlusApiResultPlusGameGrowthLevelConfigVO>(backendApiPath(`/game/growth/level-configs/${configId}`));
  }

/** Get growth account detail */
  async getGrowthAccount(accountId: string | number): Promise<PlusApiResultPlusGameGrowthAccountVO> {
    return this.client.get<PlusApiResultPlusGameGrowthAccountVO>(backendApiPath(`/game/growth/accounts/${accountId}`));
  }

/** List growth reward claims by account */
  async listGrowthRewardClaimsByAccount(accountId: string | number): Promise<PlusApiResultListPlusGameGrowthRewardClaimVO> {
    return this.client.get<PlusApiResultListPlusGameGrowthRewardClaimVO>(backendApiPath(`/game/growth/accounts/${accountId}/reward-claims`));
  }

/** Get game definition */
  async getById(id: string | number): Promise<PlusApiResultPlusGameDefinitionVO> {
    return this.client.get<PlusApiResultPlusGameDefinitionVO>(backendApiPath(`/game/definition/${id}`));
  }

/** Delete game definition */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/game/definition/${id}`));
  }

/** Get challenge detail */
  async getChallenge(challengeId: string | number): Promise<PlusApiResultPlusGameChallengeVO> {
    return this.client.get<PlusApiResultPlusGameChallengeVO>(backendApiPath(`/game/challenges/${challengeId}`));
  }

/** Get arena detail */
  async getArena(arenaId: string | number): Promise<PlusApiResultPlusGameArenaVO> {
    return this.client.get<PlusApiResultPlusGameArenaVO>(backendApiPath(`/game/arenas/${arenaId}`));
  }

/** Get action record detail */
  async getAction(actionId: string | number): Promise<PlusApiResultPlusGameActionRecordVO> {
    return this.client.get<PlusApiResultPlusGameActionRecordVO>(backendApiPath(`/game/actions/${actionId}`));
  }
}

export function createGameApi(client: HttpClient): GameApi {
  return new GameApi(client);
}
