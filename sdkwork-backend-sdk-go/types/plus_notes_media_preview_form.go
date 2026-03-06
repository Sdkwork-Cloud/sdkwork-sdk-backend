package types

// 媒体草稿预览表单
type PlusNotesMediaPreviewForm struct {
	UserId int `json:"userId"`
	Platform string `json:"platform"`
	Product string `json:"product"`
	DraftMediaId string `json:"draftMediaId"`
}
