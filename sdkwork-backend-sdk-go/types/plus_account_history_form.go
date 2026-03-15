package types

// Account history creation form
type PlusAccountHistoryForm struct {
	AccountType string `json:"accountType"`
	AssetType string `json:"assetType"`
	AccountId int `json:"accountId"`
	TransactionId string `json:"transactionId"`
	TransactionType string `json:"transactionType"`
	Status string `json:"status"`
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
	Remarks string `json:"remarks"`
}
