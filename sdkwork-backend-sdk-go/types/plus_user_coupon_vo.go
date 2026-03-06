package types

// 用户优惠券VO，记录用户持有的优惠券信息
type PlusUserCouponVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	UserId int `json:"userId"`
	CouponId int `json:"couponId"`
	CouponCode string `json:"couponCode"`
	AcquireTime string `json:"acquireTime"`
	AcquireRequestNo string `json:"acquireRequestNo"`
	AcquireType string `json:"acquireType"`
	PointCost int `json:"pointCost"`
	PointsRefunded bool `json:"pointsRefunded"`
	PointsRefundAt string `json:"pointsRefundAt"`
	UseTime string `json:"useTime"`
	Status string `json:"status"`
}
