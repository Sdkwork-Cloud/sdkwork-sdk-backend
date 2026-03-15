package types

// Growth record view object
type PlusGameGrowthRecordVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RecordId int `json:"recordId"`
	UserId int `json:"userId"`
	AccountType string `json:"accountType"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	SeasonKey string `json:"seasonKey"`
	RoomId int `json:"roomId"`
	MatchId int `json:"matchId"`
	TournamentId int `json:"tournamentId"`
	SourceType string `json:"sourceType"`
	BizNo string `json:"bizNo"`
	Reason string `json:"reason"`
	ExpBefore int `json:"expBefore"`
	ExpDelta int `json:"expDelta"`
	ExpAfter int `json:"expAfter"`
	TotalExpBefore int `json:"totalExpBefore"`
	TotalExpDelta int `json:"totalExpDelta"`
	TotalExpAfter int `json:"totalExpAfter"`
	LevelConfigIdBefore int `json:"levelConfigIdBefore"`
	LevelConfigIdAfter int `json:"levelConfigIdAfter"`
	LevelNoBefore int `json:"levelNoBefore"`
	LevelNoAfter int `json:"levelNoAfter"`
	LevelCodeBefore string `json:"levelCodeBefore"`
	LevelCodeAfter string `json:"levelCodeAfter"`
	LevelUp bool `json:"levelUp"`
	OperatorUserId int `json:"operatorUserId"`
	OccurredAt string `json:"occurredAt"`
	SettlementData map[string]interface{} `json:"settlementData"`
	ExtData map[string]interface{} `json:"extData"`
}
