package types

// Detail creation form
type PlusDetailForm struct {
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	Content DetailContent `json:"content"`
}
