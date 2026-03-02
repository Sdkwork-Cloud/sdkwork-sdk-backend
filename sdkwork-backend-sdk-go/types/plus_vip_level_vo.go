package types

// VIP等级VO，包含VIP等级的基本信息及权益ID集合
type PlusVipLevelVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	LevelValue int `json:"levelValue"`
	RequiredPoints int `json:"requiredPoints"`
	Description string `json:"description"`
	BenefitIds []int `json:"benefitIds"`
	Benefits []PlusVipBenefitVO `json:"benefits"`
}
