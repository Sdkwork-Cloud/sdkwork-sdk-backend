package types

// Order creation form
type PlusOrderForm struct {
	OrderType string `json:"orderType"`
	UserId int `json:"userId"`
	OrderSn string `json:"orderSn"`
	TransactionId string `json:"transactionId"`
	OutTradeNo string `json:"outTradeNo"`
	TotalAmount float64 `json:"totalAmount"`
	PaidAmount float64 `json:"paidAmount"`
	PaidPointsAmount int `json:"paidPointsAmount"`
	Status string `json:"status"`
	PayTime string `json:"payTime"`
	ExpireTime string `json:"expireTime"`
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
}
