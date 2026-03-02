package types

// 微信支付创建订单返回对象
type WechatPayObject struct {
	PrepayId string `json:"prepayId"`
	MwebUrl string `json:"mwebUrl"`
	CodeUrl string `json:"codeUrl"`
	TimeStamp string `json:"timeStamp"`
	NonceStr string `json:"nonceStr"`
	SignType string `json:"signType"`
	PaySign string `json:"paySign"`
	OutTradeNo string `json:"outTradeNo"`
	TradeType string `json:"tradeType"`
}
