package types

// User coupon creation form
type PlusUserCouponForm struct {
	UserId int `json:"userId"`
	CouponId int `json:"couponId"`
	CouponCode string `json:"couponCode"`
	AcquireAt string `json:"acquireAt"`
	UseAt string `json:"useAt"`
	Status string `json:"status"`
}
