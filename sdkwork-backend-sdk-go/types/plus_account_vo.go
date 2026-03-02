package types

// 用户账户VO，记录余额和积分信息
type PlusAccountVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	UserId int `json:"userId"`
	AvailableBalance float64 `json:"availableBalance"`
	FrozenBalance float64 `json:"frozenBalance"`
	AvailablePoints int `json:"availablePoints"`
	FrozenPoints int `json:"frozenPoints"`
	Status string `json:"status"`
	HistoryList []PlusAccountHistoryVO `json:"historyList"`
}
