package types

// 商品分类属性VO
type PlusAttributeVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Version int `json:"version"`
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
