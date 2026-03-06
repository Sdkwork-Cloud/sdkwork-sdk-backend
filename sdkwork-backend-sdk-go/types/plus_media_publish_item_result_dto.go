package types


type PlusMediaPublishItemResultDTO struct {
	RecordId int `json:"recordId"`
	NoteId int `json:"noteId"`
	NoteUuid string `json:"noteUuid"`
	Title string `json:"title"`
	ArticleIndex int `json:"articleIndex"`
	Success bool `json:"success"`
	Errcode int `json:"errcode"`
	Errmsg string `json:"errmsg"`
	DraftMediaId string `json:"draftMediaId"`
	PublishId string `json:"publishId"`
	ArticleId string `json:"articleId"`
}
