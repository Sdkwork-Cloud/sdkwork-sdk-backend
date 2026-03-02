package types

// Collection creation form
type PlusCollectionForm struct {
	Name string `json:"name"`
	Description string `json:"description"`
	Type string `json:"type"`
	ContentId int `json:"contentId"`
}
