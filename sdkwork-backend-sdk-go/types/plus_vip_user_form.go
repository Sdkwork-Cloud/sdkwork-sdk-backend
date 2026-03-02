package types

// VIP user creation form
type PlusVipUserForm struct {
	UserId int `json:"userId"`
	VipLevelId int `json:"vipLevelId"`
	Status string `json:"status"`
	PointBalance int `json:"pointBalance"`
	TotalRechargedPoints int `json:"totalRechargedPoints"`
	ValidFrom string `json:"validFrom"`
	ValidTo string `json:"validTo"`
	LastActiveTime string `json:"lastActiveTime"`
	Remark string `json:"remark"`
}
