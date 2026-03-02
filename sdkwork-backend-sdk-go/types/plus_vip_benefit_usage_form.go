package types

// VIP benefit usage creation form
type PlusVipBenefitUsageForm struct {
	UserId int `json:"userId"`
	BenefitType string `json:"benefitType"`
	UsageTime string `json:"usageTime"`
	UsageCount int `json:"usageCount"`
	Status int `json:"status"`
	SourceId int `json:"sourceId"`
	SourceType string `json:"sourceType"`
	Remark string `json:"remark"`
}
