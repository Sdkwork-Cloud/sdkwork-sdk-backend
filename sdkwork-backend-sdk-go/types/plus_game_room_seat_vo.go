package types

// 棋牌游戏房间座位VO
type PlusGameRoomSeatVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	SeatId int `json:"seatId"`
	RoomId int `json:"roomId"`
	DefinitionId int `json:"definitionId"`
	GameType string `json:"gameType"`
	UserId int `json:"userId"`
	SeatNo int `json:"seatNo"`
	Status string `json:"status"`
	PlayerType string `json:"playerType"`
	NicknameSnapshot string `json:"nicknameSnapshot"`
	AvatarUrl string `json:"avatarUrl"`
	JoinSource string `json:"joinSource"`
	TeamNo int `json:"teamNo"`
	Ready bool `json:"ready"`
	Trusteeship bool `json:"trusteeship"`
	Spectator bool `json:"spectator"`
	RoomScore int `json:"roomScore"`
	Chips int `json:"chips"`
	EliminatedRankNo int `json:"eliminatedRankNo"`
	JoinedAt string `json:"joinedAt"`
	EliminatedAt string `json:"eliminatedAt"`
	LeftAt string `json:"leftAt"`
	HandSnapshot map[string]interface{} `json:"handSnapshot"`
}
