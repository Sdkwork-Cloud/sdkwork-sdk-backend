package types

// PPT模板详情配置VO（存储模板中各页面/section的具体配置）
type PlusPptTemplateSlideVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	TemplateId int `json:"templateId"`
	SectionTitle string `json:"sectionTitle"`
	SectionContent string `json:"sectionContent"`
	PageNumber int `json:"pageNumber"`
	LayoutType string `json:"layoutType"`
	BackgroundImage string `json:"backgroundImage"`
	SortOrder int `json:"sortOrder"`
	IsRequired bool `json:"isRequired"`
}
