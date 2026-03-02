package types

// 会员卡扩展表VO，存储会员卡专属属性
type PlusMemberCardVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	CardId int `json:"cardId"`
	SupplyBonus bool `json:"supplyBonus"`
	SupplyBalance bool `json:"supplyBalance"`
	BonusName string `json:"bonusName"`
	BalanceName string `json:"balanceName"`
	Prerogative string `json:"prerogative"`
	AutoActivate bool `json:"autoActivate"`
	WxActivate bool `json:"wxActivate"`
	CostMoneyUnit int `json:"costMoneyUnit"`
	IncreaseBonus int `json:"increaseBonus"`
	InitIncreaseBonus int `json:"initIncreaseBonus"`
	MaxIncreaseBonus int `json:"maxIncreaseBonus"`
	CostBonusUnit int `json:"costBonusUnit"`
	ReduceMoney int `json:"reduceMoney"`
	LeastMoneyToUseBonus int `json:"leastMoneyToUseBonus"`
	MaxReduceBonus int `json:"maxReduceBonus"`
}
