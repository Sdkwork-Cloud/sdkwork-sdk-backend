package types

// 账户兑换比例VO
type AccountExchangeRateVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ConfigKey string `json:"configKey"`
	PointsToCashRate float64 `json:"pointsToCashRate"`
	Remarks string `json:"remarks"`
}
