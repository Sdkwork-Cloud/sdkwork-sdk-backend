package types

// 濯掍綋鑽夌棰勮琛ㄥ崟
type PlusNotesMediaPreviewForm struct {
	UserId int `json:"userId"`
	Platform string `json:"platform"`
	Product string `json:"product"`
	DraftMediaId string `json:"draftMediaId"`
}
