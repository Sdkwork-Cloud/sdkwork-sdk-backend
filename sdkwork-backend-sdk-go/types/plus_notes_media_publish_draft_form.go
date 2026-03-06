package types

// 媒体草稿发布表单
type PlusNotesMediaPublishDraftForm struct {
	UserId int `json:"userId"`
	Platform string `json:"platform"`
	Product string `json:"product"`
	DraftMediaId string `json:"draftMediaId"`
}
