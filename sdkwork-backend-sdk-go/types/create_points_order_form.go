package types

// Create points order form
type CreatePointsOrderForm struct {
	Items []OrderContentItem `json:"items"`
	PointsAmount int `json:"pointsAmount"`
	ExpireTime string `json:"expireTime"`
}
