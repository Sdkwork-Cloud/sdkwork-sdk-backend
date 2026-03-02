package types

// Point change creation form
type PlusVipPointChangeForm struct {
	UserId int `json:"userId"`
	ChangeType string `json:"changeType"`
	ChangeAmount int `json:"changeAmount"`
	BeforeBalance int `json:"beforeBalance"`
	AfterBalance int `json:"afterBalance"`
	SourceId int `json:"sourceId"`
	SourceType string `json:"sourceType"`
	Remark string `json:"remark"`
}
