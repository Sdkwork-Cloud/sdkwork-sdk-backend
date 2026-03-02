package types

// VIP level benefit creation form
type PlusVipLevelBenefitForm struct {
	VipLevelId int `json:"vipLevelId"`
	BenefitId int `json:"benefitId"`
	DailyLimit int `json:"dailyLimit"`
	MonthlyLimit int `json:"monthlyLimit"`
	TotalLimit int `json:"totalLimit"`
	Status string `json:"status"`
	Metadata VipLevelBenefitMetadata `json:"metadata"`
	Remark string `json:"remark"`
}
