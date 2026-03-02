package types

// PPT模板幻灯片配置，存储模板中单个幻灯片的结构和属性
type PlusPptTemplateSlide struct {
	TenantId int `json:"tenantId"`
	OrganizationId int `json:"organizationId"`
	DataScope string `json:"dataScope"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	V int `json:"v"`
	TemplateId int `json:"templateId"`
	PptTemplate PlusPptTemplate `json:"pptTemplate"`
	Type PPTSlideType `json:"type"`
	Title string `json:"title"`
	Description string `json:"description"`
	SortOrder int `json:"sortOrder"`
	LayoutType string `json:"layoutType"`
	SlideConfig PlusPptSlide `json:"slideConfig"`
	Payload PlusPptPayload `json:"payload"`
	PptturningMode PPTTurningMode `json:"pptturningMode"`
}
