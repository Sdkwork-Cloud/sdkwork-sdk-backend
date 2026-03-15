package types

// Service order action result
type ServiceOrderVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	OrderId int `json:"orderId"`
	OrderSn string `json:"orderSn"`
	TaskCode string `json:"taskCode"`
	DispatchMode string `json:"dispatchMode"`
	DispatchStatus string `json:"dispatchStatus"`
	WorkerUserId int `json:"workerUserId"`
	DispatchExpireTime string `json:"dispatchExpireTime"`
	Success bool `json:"success"`
	Message string `json:"message"`
}
