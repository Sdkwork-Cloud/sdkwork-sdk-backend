package types

// Membership card creation form
type PlusCardForm struct {
	CardOrganizationId int `json:"cardOrganizationId"`
	CardType string `json:"cardType"`
	CodeType string `json:"codeType"`
	Title string `json:"title"`
	BrandName string `json:"brandName"`
	LogoUrl string `json:"logoUrl"`
	Notice string `json:"notice"`
	Description string `json:"description"`
	Color string `json:"color"`
	Quantity int `json:"quantity"`
	GetLimit int `json:"getLimit"`
	CanShare bool `json:"canShare"`
	CanGiveFriend bool `json:"canGiveFriend"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
	Status string `json:"status"`
}
