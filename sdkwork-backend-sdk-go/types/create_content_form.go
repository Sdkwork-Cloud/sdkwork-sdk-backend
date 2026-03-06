package types

// Form for creating content work
type CreateContentForm struct {
	Title string `json:"title"`
	Type string `json:"type"`
	Description string `json:"description"`
	CoverUrl string `json:"coverUrl"`
}
