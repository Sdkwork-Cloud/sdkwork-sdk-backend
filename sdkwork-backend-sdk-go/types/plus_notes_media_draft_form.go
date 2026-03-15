package types

// 濯掍綋鑽夌鍒涘缓琛ㄥ崟
type PlusNotesMediaDraftForm struct {
	UserId int `json:"userId"`
	Platform string `json:"platform"`
	Product string `json:"product"`
	Articles []PlusNotesPublishArticleForm `json:"articles"`
}
