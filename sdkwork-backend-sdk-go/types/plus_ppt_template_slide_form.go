package types

// PPT template slide creation form
type PlusPptTemplateSlideForm struct {
	TemplateId int `json:"templateId"`
	PageNumber int `json:"pageNumber"`
	LayoutType string `json:"layoutType"`
	SortOrder int `json:"sortOrder"`
	IsRequired bool `json:"isRequired"`
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
}
