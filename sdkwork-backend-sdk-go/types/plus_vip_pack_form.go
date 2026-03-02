package types

// VIP package creation form
type PlusVipPackForm struct {
	Name string `json:"name"`
	Description string `json:"description"`
	GroupId int `json:"groupId"`
	VipLevelId int `json:"vipLevelId"`
	Price float64 `json:"price"`
	PointAmount int `json:"pointAmount"`
	VipDurationDays int `json:"vipDurationDays"`
	Status string `json:"status"`
	SortWeight int `json:"sortWeight"`
	ValidFrom string `json:"validFrom"`
	ValidTo string `json:"validTo"`
	Remark string `json:"remark"`
}
