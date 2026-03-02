package types

// VIP会员用户信息VO
type PlusVipUserVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	UserId int `json:"userId"`
	VipLevelId int `json:"vipLevelId"`
	Status string `json:"status"`
	PointBalance int `json:"pointBalance"`
	TotalRechargedPoints int `json:"totalRechargedPoints"`
	ValidFrom string `json:"validFrom"`
	ValidTo string `json:"validTo"`
	LastActiveTime string `json:"lastActiveTime"`
	Remark string `json:"remark"`
	VipLevel PlusVipLevelVO `json:"vipLevel"`
}
