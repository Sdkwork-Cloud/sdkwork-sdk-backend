package types

// 棋牌游戏动作流水VO
type PlusGameActionRecordVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ActionId int `json:"actionId"`
	RoomId int `json:"roomId"`
	MatchId int `json:"matchId"`
	RoundId int `json:"roundId"`
	GameType string `json:"gameType"`
	RoomType string `json:"roomType"`
	ReplayId int `json:"replayId"`
	TournamentId int `json:"tournamentId"`
	PlayerUserId int `json:"playerUserId"`
	SeatNo int `json:"seatNo"`
	PlayerType string `json:"playerType"`
	SeqNo int `json:"seqNo"`
	TurnNo int `json:"turnNo"`
	PhaseName string `json:"phaseName"`
	ActionType string `json:"actionType"`
	ActionCode string `json:"actionCode"`
	Notation string `json:"notation"`
	TargetSeatNo int `json:"targetSeatNo"`
	SourcePosition string `json:"sourcePosition"`
	TargetPosition string `json:"targetPosition"`
	ConsumeMillis int `json:"consumeMillis"`
	ValidAction bool `json:"validAction"`
	SystemAction bool `json:"systemAction"`
	TimeoutAction bool `json:"timeoutAction"`
	ActionAt string `json:"actionAt"`
	ActionPayload map[string]interface{} `json:"actionPayload"`
	BeforeState map[string]interface{} `json:"beforeState"`
	AfterState map[string]interface{} `json:"afterState"`
}
