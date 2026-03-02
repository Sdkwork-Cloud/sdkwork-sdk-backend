package types

// VIP recharge package creation form
type PlusVipRechargePackForm struct {
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
