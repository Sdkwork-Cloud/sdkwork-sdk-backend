package types

// 濯掍綋鑽夌鍙戝竷琛ㄥ崟
type PlusNotesMediaPublishDraftForm struct {
	UserId int `json:"userId"`
	Platform string `json:"platform"`
	Product string `json:"product"`
	DraftMediaId string `json:"draftMediaId"`
}
