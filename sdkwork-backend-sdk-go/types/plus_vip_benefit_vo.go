package types

// VIP权益定义VO
type PlusVipBenefitVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	BenefitKey string `json:"benefitKey"`
	Type string `json:"type"`
}
