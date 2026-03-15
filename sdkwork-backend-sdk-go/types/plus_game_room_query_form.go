package types

// 棋牌游戏房间查询表单
type PlusGameRoomQueryForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	UserId int `json:"userId"`
	DefinitionId int `json:"definitionId"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	SeasonKey string `json:"seasonKey"`
	RoomNo string `json:"roomNo"`
	RoomNoLike string `json:"roomNoLike"`
	NameLike string `json:"nameLike"`
	RoomType string `json:"roomType"`
	Status string `json:"status"`
	Visibility string `json:"visibility"`
	Ranked bool `json:"ranked"`
	AllowSpectator bool `json:"allowSpectator"`
	LeaderboardEligible bool `json:"leaderboardEligible"`
	ReplayEnabled bool `json:"replayEnabled"`
	ClubId int `json:"clubId"`
	TournamentId int `json:"tournamentId"`
	RegionCode string `json:"regionCode"`
	CurrentMatchId int `json:"currentMatchId"`
}
