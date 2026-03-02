package types

// VIP权益使用记录VO
type PlusVipBenefitUsageVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	UserId int `json:"userId"`
	BenefitType string `json:"benefitType"`
	UsageTime string `json:"usageTime"`
	UsageCount int `json:"usageCount"`
	Status int `json:"status"`
	SourceId int `json:"sourceId"`
	SourceType string `json:"sourceType"`
	Remark string `json:"remark"`
}
