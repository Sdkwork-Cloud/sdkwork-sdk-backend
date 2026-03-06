package types


type PlusMediaPublishRecordDTO struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Version int `json:"version"`
	BatchId string `json:"batchId"`
	UserId int `json:"userId"`
	NoteId int `json:"noteId"`
	NoteUuid string `json:"noteUuid"`
	NoteTitle string `json:"noteTitle"`
	Platform string `json:"platform"`
	Action string `json:"action"`
	Status string `json:"status"`
	DraftMediaId string `json:"draftMediaId"`
	PublishId string `json:"publishId"`
	ArticleId string `json:"articleId"`
	ArticleIndex int `json:"articleIndex"`
	Errcode int `json:"errcode"`
	Errmsg string `json:"errmsg"`
	RequestPayload map[string]interface{} `json:"requestPayload"`
	ResponsePayload map[string]interface{} `json:"responsePayload"`
	StartedAt string `json:"startedAt"`
	FinishedAt string `json:"finishedAt"`
}
