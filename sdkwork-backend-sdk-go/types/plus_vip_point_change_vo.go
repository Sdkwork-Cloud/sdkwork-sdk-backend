package types

// VIP积分变动记录VO
type PlusVipPointChangeVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	UserId int `json:"userId"`
	ChangeType string `json:"changeType"`
	ChangeAmount int `json:"changeAmount"`
	BeforeBalance int `json:"beforeBalance"`
	AfterBalance int `json:"afterBalance"`
	SourceId int `json:"sourceId"`
	SourceType string `json:"sourceType"`
	Remark string `json:"remark"`
}
