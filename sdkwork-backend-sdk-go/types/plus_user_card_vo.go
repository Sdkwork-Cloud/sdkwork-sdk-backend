package types

// 用户会员卡VO，用于表示用户与会员卡的绑定关系
type PlusUserCardVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	UserId int `json:"userId"`
	CardId int `json:"cardId"`
	CardCode string `json:"cardCode"`
	AcquireTime string `json:"acquireTime"`
	ActivateTime string `json:"activateTime"`
	CancelTime string `json:"cancelTime"`
	Points int `json:"points"`
	Balance int `json:"balance"`
}
