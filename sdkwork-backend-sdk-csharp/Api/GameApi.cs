using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class GameApi
    {
        private readonly HttpClient _client;

        public GameApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update game definition
        /// </summary>
        public async Task<PlusApiResultPlusGameDefinitionVO?> UpdateAsync(PlusGameDefinitionForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusGameDefinitionVO>(ApiPaths.BackendPath("/game/definition"), body);
        }

        /// <summary>
        /// Create game definition
        /// </summary>
        public async Task<PlusApiResultPlusGameDefinitionVO?> CreateAsync(PlusGameDefinitionForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusGameDefinitionVO>(ApiPaths.BackendPath("/game/definition"), body);
        }

        /// <summary>
        /// Register tournament
        /// </summary>
        public async Task<PlusApiResultBoolean?> RegisterTournamentAsync(string tournamentId, PlusGameTournamentRegistrationForm body)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/game/tournaments/{tournamentId}/register"), body);
        }

        /// <summary>
        /// Manage tournament player
        /// </summary>
        public async Task<PlusApiResultPlusGameTournamentPlayerVO?> ManageTournamentPlayerAsync(string tournamentId, string userId, PlusGameTournamentPlayerManageForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultPlusGameTournamentPlayerVO>(ApiPaths.BackendPath($"/game/tournaments/{tournamentId}/players/{userId}/manage"), body);
        }

        /// <summary>
        /// List tournament players by page
        /// </summary>
        public async Task<PlusApiResultPagePlusGameTournamentPlayerVO?> ListTournamentPlayersAsync(string tournamentId, PlusGameTournamentPlayerQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusGameTournamentPlayerVO>(ApiPaths.BackendPath($"/game/tournaments/{tournamentId}/players/list"), body, query);
        }

        /// <summary>
        /// Batch update tournament player status
        /// </summary>
        public async Task<PlusApiResultListPlusGameTournamentPlayerVO?> BatchUpdateTournamentPlayerStatusAsync(string tournamentId, PlusGameTournamentBatchStatusForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusGameTournamentPlayerVO>(ApiPaths.BackendPath($"/game/tournaments/{tournamentId}/players/batch_status"), body);
        }

        /// <summary>
        /// Batch finish tournament players
        /// </summary>
        public async Task<PlusApiResultListPlusGameTournamentPlayerVO?> BatchFinishTournamentPlayersAsync(string tournamentId, PlusGameTournamentBatchStatusForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusGameTournamentPlayerVO>(ApiPaths.BackendPath($"/game/tournaments/{tournamentId}/players/batch_finish"), body);
        }

        /// <summary>
        /// Batch eliminate tournament players
        /// </summary>
        public async Task<PlusApiResultListPlusGameTournamentPlayerVO?> BatchEliminateTournamentPlayersAsync(string tournamentId, PlusGameTournamentBatchStatusForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusGameTournamentPlayerVO>(ApiPaths.BackendPath($"/game/tournaments/{tournamentId}/players/batch_eliminate"), body);
        }

        /// <summary>
        /// Batch check in tournament players
        /// </summary>
        public async Task<PlusApiResultListPlusGameTournamentPlayerVO?> BatchCheckInTournamentPlayersAsync(string tournamentId, PlusGameTournamentBatchStatusForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusGameTournamentPlayerVO>(ApiPaths.BackendPath($"/game/tournaments/{tournamentId}/players/batch_check_in"), body);
        }

        /// <summary>
        /// Batch arrange tournament players
        /// </summary>
        public async Task<PlusApiResultListPlusGameTournamentPlayerVO?> BatchArrangeTournamentPlayersAsync(string tournamentId, PlusGameTournamentBatchArrangeForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusGameTournamentPlayerVO>(ApiPaths.BackendPath($"/game/tournaments/{tournamentId}/players/batch_arrange"), body);
        }

        /// <summary>
        /// Batch advance tournament players
        /// </summary>
        public async Task<PlusApiResultListPlusGameTournamentPlayerVO?> BatchAdvanceTournamentPlayersAsync(string tournamentId, PlusGameTournamentBatchStatusForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusGameTournamentPlayerVO>(ApiPaths.BackendPath($"/game/tournaments/{tournamentId}/players/batch_advance"), body);
        }

        /// <summary>
        /// Manage tournament
        /// </summary>
        public async Task<PlusApiResultPlusGameTournamentVO?> ManageTournamentAsync(string tournamentId, PlusGameTournamentManageForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultPlusGameTournamentVO>(ApiPaths.BackendPath($"/game/tournaments/{tournamentId}/manage"), body);
        }

        /// <summary>
        /// Cancel tournament registration
        /// </summary>
        public async Task<PlusApiResultBoolean?> CancelTournamentRegistrationAsync(string tournamentId, PlusGameTournamentRegistrationForm body)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/game/tournaments/{tournamentId}/cancel_registration"), body);
        }

        /// <summary>
        /// List tournaments by page
        /// </summary>
        public async Task<PlusApiResultPagePlusGameTournamentVO?> ListTournamentsAsync(PlusGameTournamentQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusGameTournamentVO>(ApiPaths.BackendPath("/game/tournaments/list"), body, query);
        }

        /// <summary>
        /// Refresh player stats
        /// </summary>
        public async Task<PlusApiResultPlusGameStatsVO?> RefreshStatsAsync(PlusGameStatsQueryForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusGameStatsVO>(ApiPaths.BackendPath("/game/stats/refresh"), body);
        }

        /// <summary>
        /// Get player stats
        /// </summary>
        public async Task<PlusApiResultPlusGameStatsVO?> GetStatsAsync(PlusGameStatsQueryForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusGameStatsVO>(ApiPaths.BackendPath("/game/stats/get"), body);
        }

        /// <summary>
        /// List score records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusGameScoreRecordVO?> ListScoreRecordsAsync(PlusGameScoreRecordQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusGameScoreRecordVO>(ApiPaths.BackendPath("/game/score-records/list"), body, query);
        }

        /// <summary>
        /// Manage room seat
        /// </summary>
        public async Task<PlusApiResultPlusGameRoomSeatVO?> ManageRoomSeatAsync(string roomId, string seatNo, PlusGameRoomSeatManageForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultPlusGameRoomSeatVO>(ApiPaths.BackendPath($"/game/rooms/{roomId}/seats/{seatNo}/manage"), body);
        }

        /// <summary>
        /// List room seats by page
        /// </summary>
        public async Task<PlusApiResultPagePlusGameRoomSeatVO?> ListRoomSeatsAsync(string roomId, PlusGameRoomSeatQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusGameRoomSeatVO>(ApiPaths.BackendPath($"/game/rooms/{roomId}/seats/list"), body, query);
        }

        /// <summary>
        /// Dismiss room
        /// </summary>
        public async Task<PlusApiResultPlusGameRoomVO?> DismissRoomAsync(string roomId, PlusGameDismissRoomForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultPlusGameRoomVO>(ApiPaths.BackendPath($"/game/rooms/{roomId}/dismiss"), body);
        }

        /// <summary>
        /// List rooms by page
        /// </summary>
        public async Task<PlusApiResultPagePlusGameRoomVO?> ListRoomsAsync(PlusGameRoomQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusGameRoomVO>(ApiPaths.BackendPath("/game/rooms/list"), body, query);
        }

        /// <summary>
        /// Manage replay
        /// </summary>
        public async Task<PlusApiResultPlusGameReplayVO?> ManageReplayAsync(string replayId, PlusGameReplayManageForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultPlusGameReplayVO>(ApiPaths.BackendPath($"/game/replays/{replayId}/manage"), body);
        }

        /// <summary>
        /// List replays by page
        /// </summary>
        public async Task<PlusApiResultPagePlusGameReplayVO?> ListReplaysAsync(PlusGameReplayQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusGameReplayVO>(ApiPaths.BackendPath("/game/replays/list"), body, query);
        }

        /// <summary>
        /// List records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusGameRecordVO?> ListRecordsAsync(PlusGameRecordQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusGameRecordVO>(ApiPaths.BackendPath("/game/records/list"), body, query);
        }

        /// <summary>
        /// Settle match
        /// </summary>
        public async Task<PlusApiResultPlusGameMatchVO?> SettleMatchAsync(string matchId)
        {
            return await _client.PostAsync<PlusApiResultPlusGameMatchVO>(ApiPaths.BackendPath($"/game/matches/{matchId}/settle"), null);
        }

        /// <summary>
        /// Manage match
        /// </summary>
        public async Task<PlusApiResultPlusGameMatchVO?> ManageMatchAsync(string matchId, PlusGameMatchManageForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultPlusGameMatchVO>(ApiPaths.BackendPath($"/game/matches/{matchId}/manage"), body);
        }

        /// <summary>
        /// Start match
        /// </summary>
        public async Task<PlusApiResultPlusGameMatchVO?> StartMatchAsync(PlusGameStartMatchForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusGameMatchVO>(ApiPaths.BackendPath("/game/matches/start"), body);
        }

        /// <summary>
        /// List matches by page
        /// </summary>
        public async Task<PlusApiResultPagePlusGameMatchVO?> ListMatchesAsync(PlusGameMatchQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusGameMatchVO>(ApiPaths.BackendPath("/game/matches/list"), body, query);
        }

        /// <summary>
        /// List leaderboard entries by page
        /// </summary>
        public async Task<PlusApiResultPagePlusGameLeaderboardEntryVO?> ListLeaderboardEntriesAsync(string leaderboardId, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusGameLeaderboardEntryVO>(ApiPaths.BackendPath($"/game/leaderboards/{leaderboardId}/entries/list"), null, query);
        }

        /// <summary>
        /// List leaderboards by page
        /// </summary>
        public async Task<PlusApiResultPagePlusGameLeaderboardVO?> ListLeaderboardsAsync(PlusGameLeaderboardQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusGameLeaderboardVO>(ApiPaths.BackendPath("/game/leaderboards/list"), body, query);
        }

        /// <summary>
        /// List user honors
        /// </summary>
        public async Task<PlusApiResultListPlusGameHonorVO?> ListHonorsAsync(PlusGameHonorQueryForm body)
        {
            return await _client.PostAsync<PlusApiResultListPlusGameHonorVO>(ApiPaths.BackendPath("/game/honors/list"), body);
        }

        /// <summary>
        /// List growth reward claims
        /// </summary>
        public async Task<PlusApiResultListPlusGameGrowthRewardClaimVO?> ListGrowthRewardClaimsAsync(PlusGameGrowthRewardClaimQueryForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusGameGrowthRewardClaimVO>(ApiPaths.BackendPath("/game/growth/reward-claims/list"), body);
        }

        /// <summary>
        /// List growth records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusGameGrowthRecordVO?> ListGrowthRecordsAsync(PlusGameGrowthRecordQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusGameGrowthRecordVO>(ApiPaths.BackendPath("/game/growth/records/list"), body, query);
        }

        /// <summary>
        /// List growth level configs by page
        /// </summary>
        public async Task<PlusApiResultPagePlusGameGrowthLevelConfigVO?> ListGrowthLevelConfigsAsync(PlusGameGrowthLevelConfigQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusGameGrowthLevelConfigVO>(ApiPaths.BackendPath("/game/growth/level-configs/list"), body, query);
        }

        /// <summary>
        /// Refresh growth account
        /// </summary>
        public async Task<PlusApiResultPlusGameGrowthAccountVO?> RefreshGrowthAccountAsync(PlusGameGrowthAccountRefreshForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusGameGrowthAccountVO>(ApiPaths.BackendPath("/game/growth/accounts/refresh"), body);
        }

        /// <summary>
        /// List growth accounts by page
        /// </summary>
        public async Task<PlusApiResultPagePlusGameGrowthAccountVO?> ListGrowthAccountsAsync(PlusGameGrowthAccountQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusGameGrowthAccountVO>(ApiPaths.BackendPath("/game/growth/accounts/list"), body, query);
        }

        /// <summary>
        /// List game definitions by page
        /// </summary>
        public async Task<PlusApiResultPagePlusGameDefinitionVO?> ListByPageAsync(PlusGameDefinitionQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusGameDefinitionVO>(ApiPaths.BackendPath("/game/definition/list"), body, query);
        }

        /// <summary>
        /// List all game definitions
        /// </summary>
        public async Task<PlusApiResultListPlusGameDefinitionVO?> ListAllAsync(PlusGameDefinitionQueryForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusGameDefinitionVO>(ApiPaths.BackendPath("/game/definition/list/all"), body);
        }

        /// <summary>
        /// Manage challenge
        /// </summary>
        public async Task<PlusApiResultPlusGameChallengeVO?> ManageChallengeAsync(string challengeId, PlusGameChallengeManageForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultPlusGameChallengeVO>(ApiPaths.BackendPath($"/game/challenges/{challengeId}/manage"), body);
        }

        /// <summary>
        /// List challenges by page
        /// </summary>
        public async Task<PlusApiResultPagePlusGameChallengeVO?> ListChallengesAsync(PlusGameChallengeQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusGameChallengeVO>(ApiPaths.BackendPath("/game/challenges/list"), body, query);
        }

        /// <summary>
        /// Create challenge
        /// </summary>
        public async Task<PlusApiResultPlusGameChallengeVO?> CreateChallengeAsync(PlusGameChallengeCreateForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultPlusGameChallengeVO>(ApiPaths.BackendPath("/game/challenges/create"), body);
        }

        /// <summary>
        /// Manage arena
        /// </summary>
        public async Task<PlusApiResultPlusGameArenaVO?> ManageArenaAsync(string arenaId, PlusGameArenaManageForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultPlusGameArenaVO>(ApiPaths.BackendPath($"/game/arenas/{arenaId}/manage"), body);
        }

        /// <summary>
        /// Open arena
        /// </summary>
        public async Task<PlusApiResultPlusGameArenaVO?> OpenArenaAsync(PlusGameArenaManageForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultPlusGameArenaVO>(ApiPaths.BackendPath("/game/arenas/open"), body);
        }

        /// <summary>
        /// List arenas by page
        /// </summary>
        public async Task<PlusApiResultPagePlusGameArenaVO?> ListArenasAsync(PlusGameArenaQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusGameArenaVO>(ApiPaths.BackendPath("/game/arenas/list"), body, query);
        }

        /// <summary>
        /// List action records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusGameActionRecordVO?> ListActionsAsync(PlusGameActionRecordQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusGameActionRecordVO>(ApiPaths.BackendPath("/game/actions/list"), body, query);
        }

        /// <summary>
        /// Get tournament detail
        /// </summary>
        public async Task<PlusApiResultPlusGameTournamentVO?> GetTournamentAsync(string tournamentId)
        {
            return await _client.GetAsync<PlusApiResultPlusGameTournamentVO>(ApiPaths.BackendPath($"/game/tournaments/{tournamentId}"));
        }

        /// <summary>
        /// Get tournament player detail
        /// </summary>
        public async Task<PlusApiResultPlusGameTournamentPlayerVO?> GetTournamentPlayerAsync(string tournamentId, string userId)
        {
            return await _client.GetAsync<PlusApiResultPlusGameTournamentPlayerVO>(ApiPaths.BackendPath($"/game/tournaments/{tournamentId}/players/{userId}"));
        }

        /// <summary>
        /// Get score record detail
        /// </summary>
        public async Task<PlusApiResultPlusGameScoreRecordVO?> GetScoreRecordAsync(string recordId)
        {
            return await _client.GetAsync<PlusApiResultPlusGameScoreRecordVO>(ApiPaths.BackendPath($"/game/score-records/{recordId}"));
        }

        /// <summary>
        /// Get room detail
        /// </summary>
        public async Task<PlusApiResultPlusGameRoomVO?> GetRoomAsync(string roomId)
        {
            return await _client.GetAsync<PlusApiResultPlusGameRoomVO>(ApiPaths.BackendPath($"/game/rooms/{roomId}"));
        }

        /// <summary>
        /// Get room seat detail
        /// </summary>
        public async Task<PlusApiResultPlusGameRoomSeatVO?> GetRoomSeatAsync(string roomId, string seatNo)
        {
            return await _client.GetAsync<PlusApiResultPlusGameRoomSeatVO>(ApiPaths.BackendPath($"/game/rooms/{roomId}/seats/{seatNo}"));
        }

        /// <summary>
        /// Get replay detail
        /// </summary>
        public async Task<PlusApiResultPlusGameReplayVO?> GetReplayAsync(string replayId)
        {
            return await _client.GetAsync<PlusApiResultPlusGameReplayVO>(ApiPaths.BackendPath($"/game/replays/{replayId}"));
        }

        /// <summary>
        /// Get replay by match
        /// </summary>
        public async Task<PlusApiResultPlusGameReplayVO?> GetReplayByMatchAsync(string matchId)
        {
            return await _client.GetAsync<PlusApiResultPlusGameReplayVO>(ApiPaths.BackendPath($"/game/replays/match/{matchId}"));
        }

        /// <summary>
        /// Get match record by user
        /// </summary>
        public async Task<PlusApiResultPlusGameRecordVO?> GetRecordAsync(string matchId, string userId)
        {
            return await _client.GetAsync<PlusApiResultPlusGameRecordVO>(ApiPaths.BackendPath($"/game/records/matches/{matchId}/users/{userId}"));
        }

        /// <summary>
        /// Get match detail
        /// </summary>
        public async Task<PlusApiResultPlusGameMatchVO?> GetMatchAsync(string matchId)
        {
            return await _client.GetAsync<PlusApiResultPlusGameMatchVO>(ApiPaths.BackendPath($"/game/matches/{matchId}"));
        }

        /// <summary>
        /// Get leaderboard detail
        /// </summary>
        public async Task<PlusApiResultPlusGameLeaderboardVO?> GetLeaderboardAsync(string leaderboardId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPlusGameLeaderboardVO>(ApiPaths.BackendPath($"/game/leaderboards/{leaderboardId}"), query);
        }

        /// <summary>
        /// Get leaderboard entry by user
        /// </summary>
        public async Task<PlusApiResultPlusGameLeaderboardEntryVO?> GetLeaderboardEntryAsync(string leaderboardId, string userId)
        {
            return await _client.GetAsync<PlusApiResultPlusGameLeaderboardEntryVO>(ApiPaths.BackendPath($"/game/leaderboards/{leaderboardId}/entries/{userId}"));
        }

        /// <summary>
        /// Get growth record detail
        /// </summary>
        public async Task<PlusApiResultPlusGameGrowthRecordVO?> GetGrowthRecordAsync(string recordId)
        {
            return await _client.GetAsync<PlusApiResultPlusGameGrowthRecordVO>(ApiPaths.BackendPath($"/game/growth/records/{recordId}"));
        }

        /// <summary>
        /// Get growth level config detail
        /// </summary>
        public async Task<PlusApiResultPlusGameGrowthLevelConfigVO?> GetGrowthLevelConfigAsync(string configId)
        {
            return await _client.GetAsync<PlusApiResultPlusGameGrowthLevelConfigVO>(ApiPaths.BackendPath($"/game/growth/level-configs/{configId}"));
        }

        /// <summary>
        /// Get growth account detail
        /// </summary>
        public async Task<PlusApiResultPlusGameGrowthAccountVO?> GetGrowthAccountAsync(string accountId)
        {
            return await _client.GetAsync<PlusApiResultPlusGameGrowthAccountVO>(ApiPaths.BackendPath($"/game/growth/accounts/{accountId}"));
        }

        /// <summary>
        /// List growth reward claims by account
        /// </summary>
        public async Task<PlusApiResultListPlusGameGrowthRewardClaimVO?> ListGrowthRewardClaimsByAccountAsync(string accountId)
        {
            return await _client.GetAsync<PlusApiResultListPlusGameGrowthRewardClaimVO>(ApiPaths.BackendPath($"/game/growth/accounts/{accountId}/reward-claims"));
        }

        /// <summary>
        /// Get game definition
        /// </summary>
        public async Task<PlusApiResultPlusGameDefinitionVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusGameDefinitionVO>(ApiPaths.BackendPath($"/game/definition/{id}"));
        }

        /// <summary>
        /// Delete game definition
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/game/definition/{id}"));
        }

        /// <summary>
        /// Get challenge detail
        /// </summary>
        public async Task<PlusApiResultPlusGameChallengeVO?> GetChallengeAsync(string challengeId)
        {
            return await _client.GetAsync<PlusApiResultPlusGameChallengeVO>(ApiPaths.BackendPath($"/game/challenges/{challengeId}"));
        }

        /// <summary>
        /// Get arena detail
        /// </summary>
        public async Task<PlusApiResultPlusGameArenaVO?> GetArenaAsync(string arenaId)
        {
            return await _client.GetAsync<PlusApiResultPlusGameArenaVO>(ApiPaths.BackendPath($"/game/arenas/{arenaId}"));
        }

        /// <summary>
        /// Get action record detail
        /// </summary>
        public async Task<PlusApiResultPlusGameActionRecordVO?> GetActionAsync(string actionId)
        {
            return await _client.GetAsync<PlusApiResultPlusGameActionRecordVO>(ApiPaths.BackendPath($"/game/actions/{actionId}"));
        }
    }
}
