package types

// 账户流水VO(包含资金和积分)
type PlusAccountHistoryVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	AssetType string `json:"assetType"`
	AccountId int `json:"accountId"`
	TransactionId string `json:"transactionId"`
	TransactionType string `json:"transactionType"`
	Amount float64 `json:"amount"`
	BalanceBefore float64 `json:"balanceBefore"`
	BalanceAfter float64 `json:"balanceAfter"`
	RelatedAccountId int `json:"relatedAccountId"`
	PointsChange int `json:"pointsChange"`
	PointsBefore int `json:"pointsBefore"`
	PointsAfter int `json:"pointsAfter"`
	SourceType string `json:"sourceType"`
	SourceId string `json:"sourceId"`
	ExpiredAt string `json:"expiredAt"`
	Status string `json:"status"`
	Remarks string `json:"remarks"`
}
