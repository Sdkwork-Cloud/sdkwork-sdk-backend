package types

// VIP benefit creation form
type PlusVipBenefitForm struct {
	Name string `json:"name"`
	Description string `json:"description"`
	BenefitKey string `json:"benefitKey"`
	Type string `json:"type"`
}
