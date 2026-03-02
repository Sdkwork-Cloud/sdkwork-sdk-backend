package types

// 会员等级VO，包含等级名称、所需积分、特权描述等信息
type PlusMemberLevelVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	CardId int `json:"cardId"`
	LevelName string `json:"levelName"`
	RequiredPoints int `json:"requiredPoints"`
	Description string `json:"description"`
	Status string `json:"status"`
}
