package types

// 账户兑换比例更新表单
type AccountExchangeRateUpdateForm struct {
	PointsToCashRate float64 `json:"pointsToCashRate"`
	Remarks string `json:"remarks"`
}
