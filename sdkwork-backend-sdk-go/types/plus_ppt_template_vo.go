package types

// PPT模板VO对象，存储PPT模板的基本信息及关联关系
type PlusPptTemplateVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Title string `json:"title"`
	Description string `json:"description"`
	CoverImages ImageMediaResourceList `json:"coverImages"`
	Type string `json:"type"`
	Status string `json:"status"`
	AuthorId int `json:"authorId"`
	AuthorName string `json:"authorName"`
	Tags PlusPptTemplateTags `json:"tags"`
	Meta PlusPptTemplateMeta `json:"meta"`
	Slides []PlusPptTemplateSlideVO `json:"slides"`
}
