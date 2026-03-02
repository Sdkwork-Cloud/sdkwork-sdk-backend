package types

// 银联支付创建订单返回对象
type UnionPayObject struct {
	PayUrl string `json:"payUrl"`
	Tn string `json:"tn"`
	MerOrderId string `json:"merOrderId"`
	MerId string `json:"merId"`
	Mode string `json:"mode"`
	SchemeStr string `json:"schemeStr"`
	Signature string `json:"signature"`
}
