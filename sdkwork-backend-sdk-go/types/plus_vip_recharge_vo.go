package types

// VIP充值记录Value Object
type PlusVipRechargeVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	UserId int `json:"userId"`
	VipLevelId int `json:"vipLevelId"`
	Amount float64 `json:"amount"`
	PointAmount int `json:"pointAmount"`
	RechargeType string `json:"rechargeType"`
	RechargeTime string `json:"rechargeTime"`
	TransactionNo string `json:"transactionNo"`
	Status int `json:"status"`
	Remark string `json:"remark"`
}
