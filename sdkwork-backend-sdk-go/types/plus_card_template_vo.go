package types

// 会员卡模板Value Object
type PlusCardTemplateVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Name string `json:"name"`
	TemplateCode string `json:"templateCode"`
	CardType string `json:"cardType"`
	CodeType string `json:"codeType"`
	Title string `json:"title"`
	Description string `json:"description"`
	BrandName string `json:"brandName"`
	LogoUrl string `json:"logoUrl"`
	Notice string `json:"notice"`
	Color string `json:"color"`
	Quantity int `json:"quantity"`
	GetLimit int `json:"getLimit"`
	CanShare bool `json:"canShare"`
	CanGiveFriend bool `json:"canGiveFriend"`
	MinimumBalance float64 `json:"minimumBalance"`
	InitialBalance float64 `json:"initialBalance"`
	DiscountRate float64 `json:"discountRate"`
	ValidityType string `json:"validityType"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
	ValidityDays int `json:"validityDays"`
	IsDeleted bool `json:"isDeleted"`
}
