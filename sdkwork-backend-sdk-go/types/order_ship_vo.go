package types

// 订单发货操作VO
type OrderShipVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Success bool `json:"success"`
	Message string `json:"message"`
	OperationTime string `json:"operationTime"`
	OrderId int `json:"orderId"`
	ShippingCompany string `json:"shippingCompany"`
	TrackingNumber string `json:"trackingNumber"`
	ShipTime string `json:"shipTime"`
	EstimatedArrivalTime string `json:"estimatedArrivalTime"`
}
