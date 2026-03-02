package types

// Member card creation form
type PlusMemberCardForm struct {
	Card PlusCard `json:"card"`
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
