package types

// 棋牌游戏房间VO
type PlusGameRoomVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RoomId int `json:"roomId"`
	UserId int `json:"userId"`
	DefinitionId int `json:"definitionId"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	SeasonKey string `json:"seasonKey"`
	RoomNo string `json:"roomNo"`
	Name string `json:"name"`
	RoomType string `json:"roomType"`
	Status string `json:"status"`
	Visibility string `json:"visibility"`
	SeatCount int `json:"seatCount"`
	CurrentPlayerCount int `json:"currentPlayerCount"`
	MinStartPlayerCount int `json:"minStartPlayerCount"`
	HostSeatNo int `json:"hostSeatNo"`
	ClubId int `json:"clubId"`
	TournamentId int `json:"tournamentId"`
	RegionCode string `json:"regionCode"`
	CurrentMatchId int `json:"currentMatchId"`
	CurrentRoundNo int `json:"currentRoundNo"`
	PlannedRoundCount int `json:"plannedRoundCount"`
	FinishedRoundCount int `json:"finishedRoundCount"`
	Ranked bool `json:"ranked"`
	AllowSpectator bool `json:"allowSpectator"`
	AllowRobot bool `json:"allowRobot"`
	AllowTrusteeship bool `json:"allowTrusteeship"`
	LeaderboardEligible bool `json:"leaderboardEligible"`
	ReplayEnabled bool `json:"replayEnabled"`
	SpectatorCount int `json:"spectatorCount"`
	InviteCode string `json:"inviteCode"`
	RuleConfig map[string]interface{} `json:"ruleConfig"`
	ExtData map[string]interface{} `json:"extData"`
	StartedAt string `json:"startedAt"`
	EndedAt string `json:"endedAt"`
	LastActiveAt string `json:"lastActiveAt"`
}
