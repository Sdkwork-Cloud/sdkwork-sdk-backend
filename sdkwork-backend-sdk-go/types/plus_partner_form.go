package types

// Partner creation form
type PlusPartnerForm struct {
	Name string `json:"name"`
	Level string `json:"level"`
	Status string `json:"status"`
	ContactName string `json:"contactName"`
	ContactPhone string `json:"contactPhone"`
	ContactEmail string `json:"contactEmail"`
	CompanyAddress string `json:"companyAddress"`
	BusinessLicense string `json:"businessLicense"`
	SettlementAccount string `json:"settlementAccount"`
	CommissionRate float64 `json:"commissionRate"`
	TotalCommission float64 `json:"totalCommission"`
	WithdrawableCommission float64 `json:"withdrawableCommission"`
	WithdrawnCommission float64 `json:"withdrawnCommission"`
	PromotionCode string `json:"promotionCode"`
	ParentId int `json:"parentId"`
	ParentMetadata PlusTreeParentMetadata `json:"parentMetadata"`
	ParentUuid string `json:"parentUuid"`
	CooperationStartTime string `json:"cooperationStartTime"`
	CooperationEndTime string `json:"cooperationEndTime"`
	Remark string `json:"remark"`
}
