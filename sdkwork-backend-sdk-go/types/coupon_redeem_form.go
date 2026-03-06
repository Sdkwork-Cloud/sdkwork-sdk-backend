package types

// 优惠券兑换请求
type CouponRedeemForm struct {
	RedeemCode string `json:"redeemCode"`
	Channel string `json:"channel"`
}
