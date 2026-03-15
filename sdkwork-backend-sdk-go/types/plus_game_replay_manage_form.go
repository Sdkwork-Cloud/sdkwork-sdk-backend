package types

// 棋牌游戏回放管理表单
type PlusGameReplayManageForm struct {
	Title string `json:"title"`
	PublicVisible bool `json:"publicVisible"`
	AllowShare bool `json:"allowShare"`
	Status string `json:"status"`
	CoverUrl string `json:"coverUrl"`
	ExpiredAt string `json:"expiredAt"`
}
