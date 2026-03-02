package types

// VIP充值套餐VO对象
type PlusVipRechargePackVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	Price float64 `json:"price"`
	PointAmount int `json:"pointAmount"`
	VipDurationDays int `json:"vipDurationDays"`
	Status int `json:"status"`
	SortWeight int `json:"sortWeight"`
	ValidFrom string `json:"validFrom"`
	ValidTo string `json:"validTo"`
	Remark string `json:"remark"`
}
