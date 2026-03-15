from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusGameDefinitionVO, PlusApiResultListPlusGameGrowthRewardClaimVO, PlusApiResultListPlusGameHonorVO, PlusApiResultListPlusGameTournamentPlayerVO, PlusApiResultPagePlusGameActionRecordVO, PlusApiResultPagePlusGameArenaVO, PlusApiResultPagePlusGameChallengeVO, PlusApiResultPagePlusGameDefinitionVO, PlusApiResultPagePlusGameGrowthAccountVO, PlusApiResultPagePlusGameGrowthLevelConfigVO, PlusApiResultPagePlusGameGrowthRecordVO, PlusApiResultPagePlusGameLeaderboardEntryVO, PlusApiResultPagePlusGameLeaderboardVO, PlusApiResultPagePlusGameMatchVO, PlusApiResultPagePlusGameRecordVO, PlusApiResultPagePlusGameReplayVO, PlusApiResultPagePlusGameRoomSeatVO, PlusApiResultPagePlusGameRoomVO, PlusApiResultPagePlusGameScoreRecordVO, PlusApiResultPagePlusGameTournamentPlayerVO, PlusApiResultPagePlusGameTournamentVO, PlusApiResultPlusGameActionRecordVO, PlusApiResultPlusGameArenaVO, PlusApiResultPlusGameChallengeVO, PlusApiResultPlusGameDefinitionVO, PlusApiResultPlusGameGrowthAccountVO, PlusApiResultPlusGameGrowthLevelConfigVO, PlusApiResultPlusGameGrowthRecordVO, PlusApiResultPlusGameLeaderboardEntryVO, PlusApiResultPlusGameLeaderboardVO, PlusApiResultPlusGameMatchVO, PlusApiResultPlusGameRecordVO, PlusApiResultPlusGameReplayVO, PlusApiResultPlusGameRoomSeatVO, PlusApiResultPlusGameRoomVO, PlusApiResultPlusGameScoreRecordVO, PlusApiResultPlusGameStatsVO, PlusApiResultPlusGameTournamentPlayerVO, PlusApiResultPlusGameTournamentVO, PlusGameActionRecordQueryForm, PlusGameArenaManageForm, PlusGameArenaQueryForm, PlusGameChallengeCreateForm, PlusGameChallengeManageForm, PlusGameChallengeQueryForm, PlusGameDefinitionForm, PlusGameDefinitionQueryForm, PlusGameDismissRoomForm, PlusGameGrowthAccountQueryForm, PlusGameGrowthAccountRefreshForm, PlusGameGrowthLevelConfigQueryForm, PlusGameGrowthRecordQueryForm, PlusGameGrowthRewardClaimQueryForm, PlusGameHonorQueryForm, PlusGameLeaderboardQueryForm, PlusGameMatchManageForm, PlusGameMatchQueryForm, PlusGameRecordQueryForm, PlusGameReplayManageForm, PlusGameReplayQueryForm, PlusGameRoomQueryForm, PlusGameRoomSeatManageForm, PlusGameRoomSeatQueryForm, PlusGameScoreRecordQueryForm, PlusGameStartMatchForm, PlusGameStatsQueryForm, PlusGameTournamentBatchArrangeForm, PlusGameTournamentBatchStatusForm, PlusGameTournamentManageForm, PlusGameTournamentPlayerManageForm, PlusGameTournamentPlayerQueryForm, PlusGameTournamentQueryForm, PlusGameTournamentRegistrationForm

class GameApi:
    """game API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusGameDefinitionForm) -> PlusApiResultPlusGameDefinitionVO:
        """Update game definition"""
        return self._client.put(f"/backend/v3/api/game/definition", json=body)

    def create(self, body: PlusGameDefinitionForm) -> PlusApiResultPlusGameDefinitionVO:
        """Create game definition"""
        return self._client.post(f"/backend/v3/api/game/definition", json=body)

    def register_tournament(self, tournamentId: str, body: PlusGameTournamentRegistrationForm) -> PlusApiResultBoolean:
        """Register tournament"""
        return self._client.post(f"/backend/v3/api/game/tournaments/{tournamentId}/register", json=body)

    def manage_tournament_player(self, tournamentId: str, userId: str, body: Optional[PlusGameTournamentPlayerManageForm] = None) -> PlusApiResultPlusGameTournamentPlayerVO:
        """Manage tournament player"""
        return self._client.post(f"/backend/v3/api/game/tournaments/{tournamentId}/players/{userId}/manage", json=body)

    def list_tournament_players(self, tournamentId: str, body: Optional[PlusGameTournamentPlayerQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusGameTournamentPlayerVO:
        """List tournament players by page"""
        return self._client.post(f"/backend/v3/api/game/tournaments/{tournamentId}/players/list", json=body, params=params)

    def batch_update_tournament_player_status(self, tournamentId: str, body: Optional[PlusGameTournamentBatchStatusForm] = None) -> PlusApiResultListPlusGameTournamentPlayerVO:
        """Batch update tournament player status"""
        return self._client.post(f"/backend/v3/api/game/tournaments/{tournamentId}/players/batch_status", json=body)

    def batch_finish_tournament_players(self, tournamentId: str, body: Optional[PlusGameTournamentBatchStatusForm] = None) -> PlusApiResultListPlusGameTournamentPlayerVO:
        """Batch finish tournament players"""
        return self._client.post(f"/backend/v3/api/game/tournaments/{tournamentId}/players/batch_finish", json=body)

    def batch_eliminate_tournament_players(self, tournamentId: str, body: Optional[PlusGameTournamentBatchStatusForm] = None) -> PlusApiResultListPlusGameTournamentPlayerVO:
        """Batch eliminate tournament players"""
        return self._client.post(f"/backend/v3/api/game/tournaments/{tournamentId}/players/batch_eliminate", json=body)

    def batch_check_in_tournament_players(self, tournamentId: str, body: Optional[PlusGameTournamentBatchStatusForm] = None) -> PlusApiResultListPlusGameTournamentPlayerVO:
        """Batch check in tournament players"""
        return self._client.post(f"/backend/v3/api/game/tournaments/{tournamentId}/players/batch_check_in", json=body)

    def batch_arrange_tournament_players(self, tournamentId: str, body: Optional[PlusGameTournamentBatchArrangeForm] = None) -> PlusApiResultListPlusGameTournamentPlayerVO:
        """Batch arrange tournament players"""
        return self._client.post(f"/backend/v3/api/game/tournaments/{tournamentId}/players/batch_arrange", json=body)

    def batch_advance_tournament_players(self, tournamentId: str, body: Optional[PlusGameTournamentBatchStatusForm] = None) -> PlusApiResultListPlusGameTournamentPlayerVO:
        """Batch advance tournament players"""
        return self._client.post(f"/backend/v3/api/game/tournaments/{tournamentId}/players/batch_advance", json=body)

    def manage_tournament(self, tournamentId: str, body: Optional[PlusGameTournamentManageForm] = None) -> PlusApiResultPlusGameTournamentVO:
        """Manage tournament"""
        return self._client.post(f"/backend/v3/api/game/tournaments/{tournamentId}/manage", json=body)

    def cancel_tournament_registration(self, tournamentId: str, body: PlusGameTournamentRegistrationForm) -> PlusApiResultBoolean:
        """Cancel tournament registration"""
        return self._client.post(f"/backend/v3/api/game/tournaments/{tournamentId}/cancel_registration", json=body)

    def list_tournaments(self, body: Optional[PlusGameTournamentQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusGameTournamentVO:
        """List tournaments by page"""
        return self._client.post(f"/backend/v3/api/game/tournaments/list", json=body, params=params)

    def refresh_stats(self, body: PlusGameStatsQueryForm) -> PlusApiResultPlusGameStatsVO:
        """Refresh player stats"""
        return self._client.post(f"/backend/v3/api/game/stats/refresh", json=body)

    def get_stats(self, body: PlusGameStatsQueryForm) -> PlusApiResultPlusGameStatsVO:
        """Get player stats"""
        return self._client.post(f"/backend/v3/api/game/stats/get", json=body)

    def list_score_records(self, body: Optional[PlusGameScoreRecordQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusGameScoreRecordVO:
        """List score records by page"""
        return self._client.post(f"/backend/v3/api/game/score-records/list", json=body, params=params)

    def manage_room_seat(self, roomId: str, seatNo: str, body: Optional[PlusGameRoomSeatManageForm] = None) -> PlusApiResultPlusGameRoomSeatVO:
        """Manage room seat"""
        return self._client.post(f"/backend/v3/api/game/rooms/{roomId}/seats/{seatNo}/manage", json=body)

    def list_room_seats(self, roomId: str, body: Optional[PlusGameRoomSeatQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusGameRoomSeatVO:
        """List room seats by page"""
        return self._client.post(f"/backend/v3/api/game/rooms/{roomId}/seats/list", json=body, params=params)

    def dismiss_room(self, roomId: str, body: Optional[PlusGameDismissRoomForm] = None) -> PlusApiResultPlusGameRoomVO:
        """Dismiss room"""
        return self._client.post(f"/backend/v3/api/game/rooms/{roomId}/dismiss", json=body)

    def list_rooms(self, body: Optional[PlusGameRoomQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusGameRoomVO:
        """List rooms by page"""
        return self._client.post(f"/backend/v3/api/game/rooms/list", json=body, params=params)

    def manage_replay(self, replayId: str, body: Optional[PlusGameReplayManageForm] = None) -> PlusApiResultPlusGameReplayVO:
        """Manage replay"""
        return self._client.post(f"/backend/v3/api/game/replays/{replayId}/manage", json=body)

    def list_replays(self, body: Optional[PlusGameReplayQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusGameReplayVO:
        """List replays by page"""
        return self._client.post(f"/backend/v3/api/game/replays/list", json=body, params=params)

    def list_records(self, body: Optional[PlusGameRecordQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusGameRecordVO:
        """List records by page"""
        return self._client.post(f"/backend/v3/api/game/records/list", json=body, params=params)

    def settle_match(self, matchId: str) -> PlusApiResultPlusGameMatchVO:
        """Settle match"""
        return self._client.post(f"/backend/v3/api/game/matches/{matchId}/settle")

    def manage_match(self, matchId: str, body: Optional[PlusGameMatchManageForm] = None) -> PlusApiResultPlusGameMatchVO:
        """Manage match"""
        return self._client.post(f"/backend/v3/api/game/matches/{matchId}/manage", json=body)

    def start_match(self, body: PlusGameStartMatchForm) -> PlusApiResultPlusGameMatchVO:
        """Start match"""
        return self._client.post(f"/backend/v3/api/game/matches/start", json=body)

    def list_matches(self, body: Optional[PlusGameMatchQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusGameMatchVO:
        """List matches by page"""
        return self._client.post(f"/backend/v3/api/game/matches/list", json=body, params=params)

    def list_leaderboard_entries(self, leaderboardId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusGameLeaderboardEntryVO:
        """List leaderboard entries by page"""
        return self._client.post(f"/backend/v3/api/game/leaderboards/{leaderboardId}/entries/list", params=params)

    def list_leaderboards(self, body: Optional[PlusGameLeaderboardQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusGameLeaderboardVO:
        """List leaderboards by page"""
        return self._client.post(f"/backend/v3/api/game/leaderboards/list", json=body, params=params)

    def list_honors(self, body: PlusGameHonorQueryForm) -> PlusApiResultListPlusGameHonorVO:
        """List user honors"""
        return self._client.post(f"/backend/v3/api/game/honors/list", json=body)

    def list_growth_reward_claims(self, body: Optional[PlusGameGrowthRewardClaimQueryForm] = None) -> PlusApiResultListPlusGameGrowthRewardClaimVO:
        """List growth reward claims"""
        return self._client.post(f"/backend/v3/api/game/growth/reward-claims/list", json=body)

    def list_growth_records(self, body: Optional[PlusGameGrowthRecordQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusGameGrowthRecordVO:
        """List growth records by page"""
        return self._client.post(f"/backend/v3/api/game/growth/records/list", json=body, params=params)

    def list_growth_level_configs(self, body: Optional[PlusGameGrowthLevelConfigQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusGameGrowthLevelConfigVO:
        """List growth level configs by page"""
        return self._client.post(f"/backend/v3/api/game/growth/level-configs/list", json=body, params=params)

    def refresh_growth_account(self, body: PlusGameGrowthAccountRefreshForm) -> PlusApiResultPlusGameGrowthAccountVO:
        """Refresh growth account"""
        return self._client.post(f"/backend/v3/api/game/growth/accounts/refresh", json=body)

    def list_growth_accounts(self, body: Optional[PlusGameGrowthAccountQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusGameGrowthAccountVO:
        """List growth accounts by page"""
        return self._client.post(f"/backend/v3/api/game/growth/accounts/list", json=body, params=params)

    def list_by_page(self, body: Optional[PlusGameDefinitionQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusGameDefinitionVO:
        """List game definitions by page"""
        return self._client.post(f"/backend/v3/api/game/definition/list", json=body, params=params)

    def list_all(self, body: Optional[PlusGameDefinitionQueryForm] = None) -> PlusApiResultListPlusGameDefinitionVO:
        """List all game definitions"""
        return self._client.post(f"/backend/v3/api/game/definition/list/all", json=body)

    def manage_challenge(self, challengeId: str, body: Optional[PlusGameChallengeManageForm] = None) -> PlusApiResultPlusGameChallengeVO:
        """Manage challenge"""
        return self._client.post(f"/backend/v3/api/game/challenges/{challengeId}/manage", json=body)

    def list_challenges(self, body: Optional[PlusGameChallengeQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusGameChallengeVO:
        """List challenges by page"""
        return self._client.post(f"/backend/v3/api/game/challenges/list", json=body, params=params)

    def create_challenge(self, body: Optional[PlusGameChallengeCreateForm] = None) -> PlusApiResultPlusGameChallengeVO:
        """Create challenge"""
        return self._client.post(f"/backend/v3/api/game/challenges/create", json=body)

    def manage_arena(self, arenaId: str, body: Optional[PlusGameArenaManageForm] = None) -> PlusApiResultPlusGameArenaVO:
        """Manage arena"""
        return self._client.post(f"/backend/v3/api/game/arenas/{arenaId}/manage", json=body)

    def open_arena(self, body: Optional[PlusGameArenaManageForm] = None) -> PlusApiResultPlusGameArenaVO:
        """Open arena"""
        return self._client.post(f"/backend/v3/api/game/arenas/open", json=body)

    def list_arenas(self, body: Optional[PlusGameArenaQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusGameArenaVO:
        """List arenas by page"""
        return self._client.post(f"/backend/v3/api/game/arenas/list", json=body, params=params)

    def list_actions(self, body: Optional[PlusGameActionRecordQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusGameActionRecordVO:
        """List action records by page"""
        return self._client.post(f"/backend/v3/api/game/actions/list", json=body, params=params)

    def get_tournament(self, tournamentId: str) -> PlusApiResultPlusGameTournamentVO:
        """Get tournament detail"""
        return self._client.get(f"/backend/v3/api/game/tournaments/{tournamentId}")

    def get_tournament_player(self, tournamentId: str, userId: str) -> PlusApiResultPlusGameTournamentPlayerVO:
        """Get tournament player detail"""
        return self._client.get(f"/backend/v3/api/game/tournaments/{tournamentId}/players/{userId}")

    def get_score_record(self, recordId: str) -> PlusApiResultPlusGameScoreRecordVO:
        """Get score record detail"""
        return self._client.get(f"/backend/v3/api/game/score-records/{recordId}")

    def get_room(self, roomId: str) -> PlusApiResultPlusGameRoomVO:
        """Get room detail"""
        return self._client.get(f"/backend/v3/api/game/rooms/{roomId}")

    def get_room_seat(self, roomId: str, seatNo: str) -> PlusApiResultPlusGameRoomSeatVO:
        """Get room seat detail"""
        return self._client.get(f"/backend/v3/api/game/rooms/{roomId}/seats/{seatNo}")

    def get_replay(self, replayId: str) -> PlusApiResultPlusGameReplayVO:
        """Get replay detail"""
        return self._client.get(f"/backend/v3/api/game/replays/{replayId}")

    def get_replay_by_match(self, matchId: str) -> PlusApiResultPlusGameReplayVO:
        """Get replay by match"""
        return self._client.get(f"/backend/v3/api/game/replays/match/{matchId}")

    def get_record(self, matchId: str, userId: str) -> PlusApiResultPlusGameRecordVO:
        """Get match record by user"""
        return self._client.get(f"/backend/v3/api/game/records/matches/{matchId}/users/{userId}")

    def get_match(self, matchId: str) -> PlusApiResultPlusGameMatchVO:
        """Get match detail"""
        return self._client.get(f"/backend/v3/api/game/matches/{matchId}")

    def get_leaderboard(self, leaderboardId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPlusGameLeaderboardVO:
        """Get leaderboard detail"""
        return self._client.get(f"/backend/v3/api/game/leaderboards/{leaderboardId}", params=params)

    def get_leaderboard_entry(self, leaderboardId: str, userId: str) -> PlusApiResultPlusGameLeaderboardEntryVO:
        """Get leaderboard entry by user"""
        return self._client.get(f"/backend/v3/api/game/leaderboards/{leaderboardId}/entries/{userId}")

    def get_growth_record(self, recordId: str) -> PlusApiResultPlusGameGrowthRecordVO:
        """Get growth record detail"""
        return self._client.get(f"/backend/v3/api/game/growth/records/{recordId}")

    def get_growth_level_config(self, configId: str) -> PlusApiResultPlusGameGrowthLevelConfigVO:
        """Get growth level config detail"""
        return self._client.get(f"/backend/v3/api/game/growth/level-configs/{configId}")

    def get_growth_account(self, accountId: str) -> PlusApiResultPlusGameGrowthAccountVO:
        """Get growth account detail"""
        return self._client.get(f"/backend/v3/api/game/growth/accounts/{accountId}")

    def list_growth_reward_claims_by_account(self, accountId: str) -> PlusApiResultListPlusGameGrowthRewardClaimVO:
        """List growth reward claims by account"""
        return self._client.get(f"/backend/v3/api/game/growth/accounts/{accountId}/reward-claims")

    def get_by_id(self, id: str) -> PlusApiResultPlusGameDefinitionVO:
        """Get game definition"""
        return self._client.get(f"/backend/v3/api/game/definition/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete game definition"""
        return self._client.delete(f"/backend/v3/api/game/definition/{id}")

    def get_challenge(self, challengeId: str) -> PlusApiResultPlusGameChallengeVO:
        """Get challenge detail"""
        return self._client.get(f"/backend/v3/api/game/challenges/{challengeId}")

    def get_arena(self, arenaId: str) -> PlusApiResultPlusGameArenaVO:
        """Get arena detail"""
        return self._client.get(f"/backend/v3/api/game/arenas/{arenaId}")

    def get_action(self, actionId: str) -> PlusApiResultPlusGameActionRecordVO:
        """Get action record detail"""
        return self._client.get(f"/backend/v3/api/game/actions/{actionId}")
