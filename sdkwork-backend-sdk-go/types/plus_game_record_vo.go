package types

// 棋牌游戏战绩VO
type PlusGameRecordVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RecordId int `json:"recordId"`
	RoomId int `json:"roomId"`
	MatchId int `json:"matchId"`
	UserId int `json:"userId"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	SeasonKey string `json:"seasonKey"`
	ClubId int `json:"clubId"`
	TournamentId int `json:"tournamentId"`
	RegionCode string `json:"regionCode"`
	SeatNo int `json:"seatNo"`
	TeamNo int `json:"teamNo"`
	ResultType string `json:"resultType"`
	RankNo int `json:"rankNo"`
	NicknameSnapshot string `json:"nicknameSnapshot"`
	AvatarUrl string `json:"avatarUrl"`
	Winner bool `json:"winner"`
	Escaped bool `json:"escaped"`
	LeaderboardEligible bool `json:"leaderboardEligible"`
	ActionCount int `json:"actionCount"`
	MoveCount int `json:"moveCount"`
	ScoreBefore int `json:"scoreBefore"`
	ScoreDelta int `json:"scoreDelta"`
	ScoreAfter int `json:"scoreAfter"`
	RatingBefore int `json:"ratingBefore"`
	RatingDelta int `json:"ratingDelta"`
	RatingAfter int `json:"ratingAfter"`
	ChipsBefore int `json:"chipsBefore"`
	ChipsDelta int `json:"chipsDelta"`
	ChipsAfter int `json:"chipsAfter"`
	JoinedAt string `json:"joinedAt"`
	FinishedAt string `json:"finishedAt"`
	BestRankSnapshot int `json:"bestRankSnapshot"`
	SettlementData map[string]interface{} `json:"settlementData"`
	HonorSnapshot map[string]interface{} `json:"honorSnapshot"`
}
