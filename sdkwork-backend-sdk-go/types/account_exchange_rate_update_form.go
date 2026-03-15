package types

// Account exchange rate update form
type AccountExchangeRateUpdateForm struct {
	PointsToCashRate float64 `json:"pointsToCashRate"`
	Remarks string `json:"remarks"`
}
