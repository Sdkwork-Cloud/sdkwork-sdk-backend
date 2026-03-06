package types

// User coupon creation form
type PlusUserCouponForm struct {
	UserId int `json:"userId"`
	CouponId int `json:"couponId"`
	CouponCode string `json:"couponCode"`
	AcquireAt string `json:"acquireAt"`
	AcquireRequestNo string `json:"acquireRequestNo"`
	AcquireType string `json:"acquireType"`
	PointCost int `json:"pointCost"`
	PointsRefunded bool `json:"pointsRefunded"`
	PointsRefundAt string `json:"pointsRefundAt"`
	UseAt string `json:"useAt"`
	Status string `json:"status"`
}
