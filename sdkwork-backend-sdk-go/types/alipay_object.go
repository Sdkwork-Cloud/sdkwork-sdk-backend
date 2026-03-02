package types

// 支付宝支付创建订单返回对象
type AlipayObject struct {
	PayUrl string `json:"payUrl"`
	Sign string `json:"sign"`
	OutTradeNo string `json:"outTradeNo"`
	TradeNo string `json:"tradeNo"`
	AppId string `json:"appId"`
	Method string `json:"method"`
	QrCode string `json:"qrCode"`
}
