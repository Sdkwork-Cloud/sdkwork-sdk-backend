package types

// 棋牌游戏房间座位管理表单
type PlusGameRoomSeatManageForm struct {
	UserId int `json:"userId"`
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
}
