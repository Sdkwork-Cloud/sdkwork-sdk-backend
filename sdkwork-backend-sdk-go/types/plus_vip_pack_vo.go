package types

// VIP套餐VO
type PlusVipPackVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
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
	VipLevel PlusVipLevelVO `json:"vipLevel"`
}
