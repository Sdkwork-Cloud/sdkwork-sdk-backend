package types

// Recharge record creation form
type PlusVipRechargeForm struct {
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
