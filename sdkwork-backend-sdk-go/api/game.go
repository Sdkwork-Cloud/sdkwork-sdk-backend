package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type GameApi struct {
    client *sdkhttp.Client
}

func NewGameApi(client *sdkhttp.Client) *GameApi {
    return &GameApi{client: client}
}

// Update game definition
func (a *GameApi) Update(body sdktypes.PlusGameDefinitionForm) (sdktypes.PlusApiResultPlusGameDefinitionVO, error) {
    raw, err := a.client.Put(BackendApiPath("/game/definition"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameDefinitionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameDefinitionVO](raw)
}

// Create game definition
func (a *GameApi) Create(body sdktypes.PlusGameDefinitionForm) (sdktypes.PlusApiResultPlusGameDefinitionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/definition"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameDefinitionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameDefinitionVO](raw)
}

// Register tournament
func (a *GameApi) RegisterTournament(tournamentId string, body sdktypes.PlusGameTournamentRegistrationForm) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/game/tournaments/%s/register", tournamentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Manage tournament player
func (a *GameApi) ManageTournamentPlayer(tournamentId string, userId string, body *sdktypes.PlusGameTournamentPlayerManageForm) (sdktypes.PlusApiResultPlusGameTournamentPlayerVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/game/tournaments/%s/players/%s/manage", tournamentId, userId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameTournamentPlayerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameTournamentPlayerVO](raw)
}

// List tournament players by page
func (a *GameApi) ListTournamentPlayers(tournamentId string, body *sdktypes.PlusGameTournamentPlayerQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusGameTournamentPlayerVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/game/tournaments/%s/players/list", tournamentId)), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusGameTournamentPlayerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusGameTournamentPlayerVO](raw)
}

// Batch update tournament player status
func (a *GameApi) BatchUpdateTournamentPlayerStatus(tournamentId string, body *sdktypes.PlusGameTournamentBatchStatusForm) (sdktypes.PlusApiResultListPlusGameTournamentPlayerVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/game/tournaments/%s/players/batch_status", tournamentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusGameTournamentPlayerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusGameTournamentPlayerVO](raw)
}

// Batch finish tournament players
func (a *GameApi) BatchFinishTournamentPlayers(tournamentId string, body *sdktypes.PlusGameTournamentBatchStatusForm) (sdktypes.PlusApiResultListPlusGameTournamentPlayerVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/game/tournaments/%s/players/batch_finish", tournamentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusGameTournamentPlayerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusGameTournamentPlayerVO](raw)
}

// Batch eliminate tournament players
func (a *GameApi) BatchEliminateTournamentPlayers(tournamentId string, body *sdktypes.PlusGameTournamentBatchStatusForm) (sdktypes.PlusApiResultListPlusGameTournamentPlayerVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/game/tournaments/%s/players/batch_eliminate", tournamentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusGameTournamentPlayerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusGameTournamentPlayerVO](raw)
}

// Batch check in tournament players
func (a *GameApi) BatchCheckInTournamentPlayers(tournamentId string, body *sdktypes.PlusGameTournamentBatchStatusForm) (sdktypes.PlusApiResultListPlusGameTournamentPlayerVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/game/tournaments/%s/players/batch_check_in", tournamentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusGameTournamentPlayerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusGameTournamentPlayerVO](raw)
}

// Batch arrange tournament players
func (a *GameApi) BatchArrangeTournamentPlayers(tournamentId string, body *sdktypes.PlusGameTournamentBatchArrangeForm) (sdktypes.PlusApiResultListPlusGameTournamentPlayerVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/game/tournaments/%s/players/batch_arrange", tournamentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusGameTournamentPlayerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusGameTournamentPlayerVO](raw)
}

// Batch advance tournament players
func (a *GameApi) BatchAdvanceTournamentPlayers(tournamentId string, body *sdktypes.PlusGameTournamentBatchStatusForm) (sdktypes.PlusApiResultListPlusGameTournamentPlayerVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/game/tournaments/%s/players/batch_advance", tournamentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusGameTournamentPlayerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusGameTournamentPlayerVO](raw)
}

// Manage tournament
func (a *GameApi) ManageTournament(tournamentId string, body *sdktypes.PlusGameTournamentManageForm) (sdktypes.PlusApiResultPlusGameTournamentVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/game/tournaments/%s/manage", tournamentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameTournamentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameTournamentVO](raw)
}

// Cancel tournament registration
func (a *GameApi) CancelTournamentRegistration(tournamentId string, body sdktypes.PlusGameTournamentRegistrationForm) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/game/tournaments/%s/cancel_registration", tournamentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// List tournaments by page
func (a *GameApi) ListTournaments(body *sdktypes.PlusGameTournamentQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusGameTournamentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/tournaments/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusGameTournamentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusGameTournamentVO](raw)
}

// Refresh player stats
func (a *GameApi) RefreshStats(body sdktypes.PlusGameStatsQueryForm) (sdktypes.PlusApiResultPlusGameStatsVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/stats/refresh"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameStatsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameStatsVO](raw)
}

// Get player stats
func (a *GameApi) GetStats(body sdktypes.PlusGameStatsQueryForm) (sdktypes.PlusApiResultPlusGameStatsVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/stats/get"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameStatsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameStatsVO](raw)
}

// List score records by page
func (a *GameApi) ListScoreRecords(body *sdktypes.PlusGameScoreRecordQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusGameScoreRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/score-records/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusGameScoreRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusGameScoreRecordVO](raw)
}

// Manage room seat
func (a *GameApi) ManageRoomSeat(roomId string, seatNo string, body *sdktypes.PlusGameRoomSeatManageForm) (sdktypes.PlusApiResultPlusGameRoomSeatVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/game/rooms/%s/seats/%s/manage", roomId, seatNo)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameRoomSeatVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameRoomSeatVO](raw)
}

// List room seats by page
func (a *GameApi) ListRoomSeats(roomId string, body *sdktypes.PlusGameRoomSeatQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusGameRoomSeatVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/game/rooms/%s/seats/list", roomId)), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusGameRoomSeatVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusGameRoomSeatVO](raw)
}

// Dismiss room
func (a *GameApi) DismissRoom(roomId string, body *sdktypes.PlusGameDismissRoomForm) (sdktypes.PlusApiResultPlusGameRoomVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/game/rooms/%s/dismiss", roomId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameRoomVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameRoomVO](raw)
}

// List rooms by page
func (a *GameApi) ListRooms(body *sdktypes.PlusGameRoomQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusGameRoomVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/rooms/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusGameRoomVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusGameRoomVO](raw)
}

// Manage replay
func (a *GameApi) ManageReplay(replayId string, body *sdktypes.PlusGameReplayManageForm) (sdktypes.PlusApiResultPlusGameReplayVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/game/replays/%s/manage", replayId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameReplayVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameReplayVO](raw)
}

// List replays by page
func (a *GameApi) ListReplays(body *sdktypes.PlusGameReplayQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusGameReplayVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/replays/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusGameReplayVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusGameReplayVO](raw)
}

// List records by page
func (a *GameApi) ListRecords(body *sdktypes.PlusGameRecordQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusGameRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/records/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusGameRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusGameRecordVO](raw)
}

// Settle match
func (a *GameApi) SettleMatch(matchId string) (sdktypes.PlusApiResultPlusGameMatchVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/game/matches/%s/settle", matchId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameMatchVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameMatchVO](raw)
}

// Manage match
func (a *GameApi) ManageMatch(matchId string, body *sdktypes.PlusGameMatchManageForm) (sdktypes.PlusApiResultPlusGameMatchVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/game/matches/%s/manage", matchId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameMatchVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameMatchVO](raw)
}

// Start match
func (a *GameApi) StartMatch(body sdktypes.PlusGameStartMatchForm) (sdktypes.PlusApiResultPlusGameMatchVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/matches/start"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameMatchVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameMatchVO](raw)
}

// List matches by page
func (a *GameApi) ListMatches(body *sdktypes.PlusGameMatchQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusGameMatchVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/matches/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusGameMatchVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusGameMatchVO](raw)
}

// List leaderboard entries by page
func (a *GameApi) ListLeaderboardEntries(leaderboardId string, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusGameLeaderboardEntryVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/game/leaderboards/%s/entries/list", leaderboardId)), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusGameLeaderboardEntryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusGameLeaderboardEntryVO](raw)
}

// List leaderboards by page
func (a *GameApi) ListLeaderboards(body *sdktypes.PlusGameLeaderboardQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusGameLeaderboardVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/leaderboards/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusGameLeaderboardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusGameLeaderboardVO](raw)
}

// List user honors
func (a *GameApi) ListHonors(body sdktypes.PlusGameHonorQueryForm) (sdktypes.PlusApiResultListPlusGameHonorVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/honors/list"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusGameHonorVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusGameHonorVO](raw)
}

// List growth reward claims
func (a *GameApi) ListGrowthRewardClaims(body *sdktypes.PlusGameGrowthRewardClaimQueryForm) (sdktypes.PlusApiResultListPlusGameGrowthRewardClaimVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/growth/reward-claims/list"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusGameGrowthRewardClaimVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusGameGrowthRewardClaimVO](raw)
}

// List growth records by page
func (a *GameApi) ListGrowthRecords(body *sdktypes.PlusGameGrowthRecordQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusGameGrowthRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/growth/records/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusGameGrowthRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusGameGrowthRecordVO](raw)
}

// List growth level configs by page
func (a *GameApi) ListGrowthLevelConfigs(body *sdktypes.PlusGameGrowthLevelConfigQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusGameGrowthLevelConfigVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/growth/level-configs/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusGameGrowthLevelConfigVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusGameGrowthLevelConfigVO](raw)
}

// Refresh growth account
func (a *GameApi) RefreshGrowthAccount(body sdktypes.PlusGameGrowthAccountRefreshForm) (sdktypes.PlusApiResultPlusGameGrowthAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/growth/accounts/refresh"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameGrowthAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameGrowthAccountVO](raw)
}

// List growth accounts by page
func (a *GameApi) ListGrowthAccounts(body *sdktypes.PlusGameGrowthAccountQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusGameGrowthAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/growth/accounts/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusGameGrowthAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusGameGrowthAccountVO](raw)
}

// List game definitions by page
func (a *GameApi) ListByPage(body *sdktypes.PlusGameDefinitionQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusGameDefinitionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/definition/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusGameDefinitionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusGameDefinitionVO](raw)
}

// List all game definitions
func (a *GameApi) ListAll(body *sdktypes.PlusGameDefinitionQueryForm) (sdktypes.PlusApiResultListPlusGameDefinitionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/definition/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusGameDefinitionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusGameDefinitionVO](raw)
}

// Manage challenge
func (a *GameApi) ManageChallenge(challengeId string, body *sdktypes.PlusGameChallengeManageForm) (sdktypes.PlusApiResultPlusGameChallengeVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/game/challenges/%s/manage", challengeId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameChallengeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameChallengeVO](raw)
}

// List challenges by page
func (a *GameApi) ListChallenges(body *sdktypes.PlusGameChallengeQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusGameChallengeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/challenges/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusGameChallengeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusGameChallengeVO](raw)
}

// Create challenge
func (a *GameApi) CreateChallenge(body *sdktypes.PlusGameChallengeCreateForm) (sdktypes.PlusApiResultPlusGameChallengeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/challenges/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameChallengeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameChallengeVO](raw)
}

// Manage arena
func (a *GameApi) ManageArena(arenaId string, body *sdktypes.PlusGameArenaManageForm) (sdktypes.PlusApiResultPlusGameArenaVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/game/arenas/%s/manage", arenaId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameArenaVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameArenaVO](raw)
}

// Open arena
func (a *GameApi) OpenArena(body *sdktypes.PlusGameArenaManageForm) (sdktypes.PlusApiResultPlusGameArenaVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/arenas/open"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameArenaVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameArenaVO](raw)
}

// List arenas by page
func (a *GameApi) ListArenas(body *sdktypes.PlusGameArenaQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusGameArenaVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/arenas/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusGameArenaVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusGameArenaVO](raw)
}

// List action records by page
func (a *GameApi) ListActions(body *sdktypes.PlusGameActionRecordQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusGameActionRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/game/actions/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusGameActionRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusGameActionRecordVO](raw)
}

// Get tournament detail
func (a *GameApi) GetTournament(tournamentId string) (sdktypes.PlusApiResultPlusGameTournamentVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/game/tournaments/%s", tournamentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameTournamentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameTournamentVO](raw)
}

// Get tournament player detail
func (a *GameApi) GetTournamentPlayer(tournamentId string, userId string) (sdktypes.PlusApiResultPlusGameTournamentPlayerVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/game/tournaments/%s/players/%s", tournamentId, userId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameTournamentPlayerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameTournamentPlayerVO](raw)
}

// Get score record detail
func (a *GameApi) GetScoreRecord(recordId string) (sdktypes.PlusApiResultPlusGameScoreRecordVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/game/score-records/%s", recordId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameScoreRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameScoreRecordVO](raw)
}

// Get room detail
func (a *GameApi) GetRoom(roomId string) (sdktypes.PlusApiResultPlusGameRoomVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/game/rooms/%s", roomId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameRoomVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameRoomVO](raw)
}

// Get room seat detail
func (a *GameApi) GetRoomSeat(roomId string, seatNo string) (sdktypes.PlusApiResultPlusGameRoomSeatVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/game/rooms/%s/seats/%s", roomId, seatNo)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameRoomSeatVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameRoomSeatVO](raw)
}

// Get replay detail
func (a *GameApi) GetReplay(replayId string) (sdktypes.PlusApiResultPlusGameReplayVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/game/replays/%s", replayId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameReplayVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameReplayVO](raw)
}

// Get replay by match
func (a *GameApi) GetReplayByMatch(matchId string) (sdktypes.PlusApiResultPlusGameReplayVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/game/replays/match/%s", matchId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameReplayVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameReplayVO](raw)
}

// Get match record by user
func (a *GameApi) GetRecord(matchId string, userId string) (sdktypes.PlusApiResultPlusGameRecordVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/game/records/matches/%s/users/%s", matchId, userId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameRecordVO](raw)
}

// Get match detail
func (a *GameApi) GetMatch(matchId string) (sdktypes.PlusApiResultPlusGameMatchVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/game/matches/%s", matchId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameMatchVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameMatchVO](raw)
}

// Get leaderboard detail
func (a *GameApi) GetLeaderboard(leaderboardId string, query map[string]interface{}) (sdktypes.PlusApiResultPlusGameLeaderboardVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/game/leaderboards/%s", leaderboardId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameLeaderboardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameLeaderboardVO](raw)
}

// Get leaderboard entry by user
func (a *GameApi) GetLeaderboardEntry(leaderboardId string, userId string) (sdktypes.PlusApiResultPlusGameLeaderboardEntryVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/game/leaderboards/%s/entries/%s", leaderboardId, userId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameLeaderboardEntryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameLeaderboardEntryVO](raw)
}

// Get growth record detail
func (a *GameApi) GetGrowthRecord(recordId string) (sdktypes.PlusApiResultPlusGameGrowthRecordVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/game/growth/records/%s", recordId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameGrowthRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameGrowthRecordVO](raw)
}

// Get growth level config detail
func (a *GameApi) GetGrowthLevelConfig(configId string) (sdktypes.PlusApiResultPlusGameGrowthLevelConfigVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/game/growth/level-configs/%s", configId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameGrowthLevelConfigVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameGrowthLevelConfigVO](raw)
}

// Get growth account detail
func (a *GameApi) GetGrowthAccount(accountId string) (sdktypes.PlusApiResultPlusGameGrowthAccountVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/game/growth/accounts/%s", accountId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameGrowthAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameGrowthAccountVO](raw)
}

// List growth reward claims by account
func (a *GameApi) ListGrowthRewardClaimsByAccount(accountId string) (sdktypes.PlusApiResultListPlusGameGrowthRewardClaimVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/game/growth/accounts/%s/reward-claims", accountId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusGameGrowthRewardClaimVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusGameGrowthRewardClaimVO](raw)
}

// Get game definition
func (a *GameApi) GetById(id string) (sdktypes.PlusApiResultPlusGameDefinitionVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/game/definition/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameDefinitionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameDefinitionVO](raw)
}

// Delete game definition
func (a *GameApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/game/definition/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get challenge detail
func (a *GameApi) GetChallenge(challengeId string) (sdktypes.PlusApiResultPlusGameChallengeVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/game/challenges/%s", challengeId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameChallengeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameChallengeVO](raw)
}

// Get arena detail
func (a *GameApi) GetArena(arenaId string) (sdktypes.PlusApiResultPlusGameArenaVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/game/arenas/%s", arenaId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameArenaVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameArenaVO](raw)
}

// Get action record detail
func (a *GameApi) GetAction(actionId string) (sdktypes.PlusApiResultPlusGameActionRecordVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/game/actions/%s", actionId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusGameActionRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusGameActionRecordVO](raw)
}
