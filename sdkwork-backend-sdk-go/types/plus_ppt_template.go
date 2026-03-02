package types

// PPT模板实体，存储模板基本信息、结构定义及关联关系
type PlusPptTemplate struct {
	TenantId int `json:"tenantId"`
	OrganizationId int `json:"organizationId"`
	DataScope string `json:"dataScope"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	V int `json:"v"`
	Title string `json:"title"`
	Description string `json:"description"`
	CoverImages ImageMediaResourceList `json:"coverImages"`
	Type string `json:"type"`
	Status string `json:"status"`
	AuthorId int `json:"authorId"`
	AuthorName string `json:"authorName"`
	Author PlusUser `json:"author"`
	Tags PlusPptTemplateTags `json:"tags"`
	Meta PlusPptTemplateMeta `json:"meta"`
	Slides []PlusPptTemplateSlide `json:"slides"`
}
