package types

// VIP等级权益关联VO
type PlusVipLevelBenefitVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	VipLevelId int `json:"vipLevelId"`
	BenefitId int `json:"benefitId"`
	DailyLimit int `json:"dailyLimit"`
	MonthlyLimit int `json:"monthlyLimit"`
	TotalLimit int `json:"totalLimit"`
	Status string `json:"status"`
	Metadata VipLevelBenefitMetadata `json:"metadata"`
	Remark string `json:"remark"`
}
