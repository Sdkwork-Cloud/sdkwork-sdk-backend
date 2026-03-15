package types

// 棋牌游戏回放查询表单
type PlusGameReplayQueryForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	RoomId int `json:"roomId"`
	MatchId int `json:"matchId"`
	GameType string `json:"gameType"`
	RoomType string `json:"roomType"`
	GameModeCode string `json:"gameModeCode"`
	SeasonKey string `json:"seasonKey"`
	ClubId int `json:"clubId"`
	TournamentId int `json:"tournamentId"`
	RegionCode string `json:"regionCode"`
	OwnerUserId int `json:"ownerUserId"`
	TitleLike string `json:"titleLike"`
	Status string `json:"status"`
	PublicVisible bool `json:"publicVisible"`
	AllowShare bool `json:"allowShare"`
}
