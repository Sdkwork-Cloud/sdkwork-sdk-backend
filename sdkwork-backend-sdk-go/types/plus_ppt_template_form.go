package types

// PPT template creation form
type PlusPptTemplateForm struct {
	Title string `json:"title"`
	Description string `json:"description"`
	CoverImages ImageMediaResourceList `json:"coverImages"`
	Type string `json:"type"`
	Status string `json:"status"`
	AuthorId int `json:"authorId"`
	AuthorName string `json:"authorName"`
	Tags PlusPptTemplateTags `json:"tags"`
	Meta PlusPptTemplateMeta `json:"meta"`
	Slides []PlusPptTemplateSlide `json:"slides"`
}
