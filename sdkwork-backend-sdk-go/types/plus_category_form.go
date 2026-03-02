package types

// Category creation form
type PlusCategoryForm struct {
	Name string `json:"name"`
	Description string `json:"description"`
	Type string `json:"type"`
	Icon string `json:"icon"`
	SortWeight int `json:"sortWeight"`
	ParentId int `json:"parentId"`
	Path []string `json:"path"`
	Visible int `json:"visible"`
	Status string `json:"status"`
}
