package types

// Attribute creation form
type PlusAttributeForm struct {
	Name string `json:"name"`
	Code string `json:"code"`
	Description string `json:"description"`
	Type string `json:"type"`
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	CategoryId int `json:"categoryId"`
	AttributeValue string `json:"attributeValue"`
	SortWeight int `json:"sortWeight"`
	Required int `json:"required"`
	Status string `json:"status"`
}
