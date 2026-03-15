package types

// 棋牌游戏积分流水VO
type PlusGameScoreRecordVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RecordId int `json:"recordId"`
	UserId int `json:"userId"`
	GameType string `json:"gameType"`
	SeasonKey string `json:"seasonKey"`
	TournamentId int `json:"tournamentId"`
	RoomId int `json:"roomId"`
	MatchId int `json:"matchId"`
	LeaderboardId int `json:"leaderboardId"`
	ChangeType string `json:"changeType"`
	RankingType string `json:"rankingType"`
	PeriodType string `json:"periodType"`
	ScopeType string `json:"scopeType"`
	BizNo string `json:"bizNo"`
	Reason string `json:"reason"`
	ScoreBefore int `json:"scoreBefore"`
	ScoreDelta int `json:"scoreDelta"`
	ScoreAfter int `json:"scoreAfter"`
	RatingBefore int `json:"ratingBefore"`
	RatingDelta int `json:"ratingDelta"`
	RatingAfter int `json:"ratingAfter"`
	ChipsBefore int `json:"chipsBefore"`
	ChipsDelta int `json:"chipsDelta"`
	ChipsAfter int `json:"chipsAfter"`
	OperatorUserId int `json:"operatorUserId"`
	OccurredAt string `json:"occurredAt"`
	SettlementData map[string]interface{} `json:"settlementData"`
	ExtData map[string]interface{} `json:"extData"`
}
