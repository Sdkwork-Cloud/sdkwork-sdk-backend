package types

// 棋牌游戏房间座位查询表单
type PlusGameRoomSeatQueryForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	RoomId int `json:"roomId"`
	UserId int `json:"userId"`
	Status string `json:"status"`
}
