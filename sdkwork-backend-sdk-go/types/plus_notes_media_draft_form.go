package types

// 媒体草稿创建表单
type PlusNotesMediaDraftForm struct {
	UserId int `json:"userId"`
	Platform string `json:"platform"`
	Product string `json:"product"`
	Articles []PlusNotesPublishArticleForm `json:"articles"`
}
