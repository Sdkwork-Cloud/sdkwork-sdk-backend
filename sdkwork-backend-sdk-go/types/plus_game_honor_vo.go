package types

// 棋牌游戏荣誉记录VO
type PlusGameHonorVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	HonorId int `json:"honorId"`
	UserId int `json:"userId"`
	GameType string `json:"gameType"`
	SeasonKey string `json:"seasonKey"`
	SourceType string `json:"sourceType"`
	SourceId int `json:"sourceId"`
	LeaderboardId int `json:"leaderboardId"`
	TournamentId int `json:"tournamentId"`
	PeriodType string `json:"periodType"`
	RankingType string `json:"rankingType"`
	Status string `json:"status"`
	ClubId int `json:"clubId"`
	RegionCode string `json:"regionCode"`
	Title string `json:"title"`
	Subtitle string `json:"subtitle"`
	Description string `json:"description"`
	BadgeCode string `json:"badgeCode"`
	IconUrl string `json:"iconUrl"`
	RankNo int `json:"rankNo"`
	ScoreValue float64 `json:"scoreValue"`
	WallVisible bool `json:"wallVisible"`
	GrantedAt string `json:"grantedAt"`
	ExpiredAt string `json:"expiredAt"`
}
