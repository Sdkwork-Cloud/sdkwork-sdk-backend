package types

// PPT template slide creation form
type PlusPptTemplateSlideForm struct {
	TemplateId int `json:"templateId"`
	SectionTitle string `json:"sectionTitle"`
	SectionContent string `json:"sectionContent"`
	PageNumber int `json:"pageNumber"`
	LayoutType string `json:"layoutType"`
	BackgroundImage string `json:"backgroundImage"`
	SortOrder int `json:"sortOrder"`
	IsRequired bool `json:"isRequired"`
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
}
