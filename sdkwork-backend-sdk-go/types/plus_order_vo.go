package types

// Order view object
type PlusOrderVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	OrderType string `json:"orderType"`
	UserId int `json:"userId"`
	Subject string `json:"subject"`
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
	TaskCode string `json:"taskCode"`
	DispatchMode string `json:"dispatchMode"`
	DispatchStatus string `json:"dispatchStatus"`
	WorkerUserId int `json:"workerUserId"`
	DispatcherUserId int `json:"dispatcherUserId"`
	AcceptedTime string `json:"acceptedTime"`
	ServiceStartTime string `json:"serviceStartTime"`
	DispatchExpireTime string `json:"dispatchExpireTime"`
	TaskPayload map[string]interface{} `json:"taskPayload"`
	PayObjects ClientPayObjects `json:"payObjects"`
}
