package types

// 棋牌游戏回放VO
type PlusGameReplayVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ReplayId int `json:"replayId"`
	ReplayNo string `json:"replayNo"`
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
	Title string `json:"title"`
	Status string `json:"status"`
	PublicVisible bool `json:"publicVisible"`
	AllowShare bool `json:"allowShare"`
	DurationSeconds int `json:"durationSeconds"`
	ActionCount int `json:"actionCount"`
	KeyFrameCount int `json:"keyFrameCount"`
	StorageKey string `json:"storageKey"`
	CoverUrl string `json:"coverUrl"`
	BoardSnapshot map[string]interface{} `json:"boardSnapshot"`
	KeyFrames map[string]interface{} `json:"keyFrames"`
	StartedAt string `json:"startedAt"`
	EndedAt string `json:"endedAt"`
	ExpiredAt string `json:"expiredAt"`
}
