package types

// Create service order form
type CreateServiceOrderForm struct {
	PublisherUserId int `json:"publisherUserId"`
	Subject string `json:"subject"`
	TaskCode string `json:"taskCode"`
	DispatchMode string `json:"dispatchMode"`
	TotalAmount float64 `json:"totalAmount"`
	DispatchExpireTime string `json:"dispatchExpireTime"`
	ExpireTime string `json:"expireTime"`
	TaskPayload map[string]interface{} `json:"taskPayload"`
	Remark string `json:"remark"`
}
