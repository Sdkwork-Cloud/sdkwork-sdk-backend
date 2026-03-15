package types

// 棋牌游戏对局查询表单
type PlusGameMatchQueryForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	DefinitionId int `json:"definitionId"`
	RoomId int `json:"roomId"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	SeasonKey string `json:"seasonKey"`
	MatchNo string `json:"matchNo"`
	MatchNoLike string `json:"matchNoLike"`
	RoomType string `json:"roomType"`
	Status string `json:"status"`
	Ranked bool `json:"ranked"`
	ClubId int `json:"clubId"`
	TournamentId int `json:"tournamentId"`
	RegionCode string `json:"regionCode"`
	WinnerUserId int `json:"winnerUserId"`
	ReplayId int `json:"replayId"`
	LeaderboardEligible bool `json:"leaderboardEligible"`
	ValidForStats bool `json:"validForStats"`
	ResultConfirmed bool `json:"resultConfirmed"`
	AbnormalFinished bool `json:"abnormalFinished"`
}
