package types


type VipLevelBenefitMetadata struct {
	MaxUsageCount int `json:"maxUsageCount"`
	MaxDailyUsage int `json:"maxDailyUsage"`
	MaxMonthlyUsage int `json:"maxMonthlyUsage"`
	IsUnlimited bool `json:"isUnlimited"`
	ValidPeriod string `json:"validPeriod"`
	ExtendInfo string `json:"extendInfo"`
}
