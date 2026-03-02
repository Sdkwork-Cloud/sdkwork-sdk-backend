package types

// AI分类VO，用于管理不同内容类型(如Agent、Tool、Prompt等)的分类
type PlusCategoryVO struct {
	ParentUuid string `json:"parentUuid"`
	ParentMetadata PlusTreeParentMetadata `json:"parentMetadata"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Name string `json:"name"`
	Description string `json:"description"`
	Type string `json:"type"`
	Icon string `json:"icon"`
	SortWeight int `json:"sortWeight"`
	ParentId int `json:"parentId"`
	Path []string `json:"path"`
	Visible int `json:"visible"`
	Status string `json:"status"`
	Children []PlusCategoryVO `json:"children"`
	Tags TagsContent `json:"tags"`
	AttributeIds []int `json:"attributeIds"`
}
