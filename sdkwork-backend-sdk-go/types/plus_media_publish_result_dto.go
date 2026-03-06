package types


type PlusMediaPublishResultDTO struct {
	BatchId string `json:"batchId"`
	Platform string `json:"platform"`
	Action string `json:"action"`
	Success bool `json:"success"`
	Errcode int `json:"errcode"`
	Errmsg string `json:"errmsg"`
	DraftMediaId string `json:"draftMediaId"`
	PublishId string `json:"publishId"`
	ArticleId string `json:"articleId"`
	PreviewData interface{} `json:"previewData"`
	Items []PlusMediaPublishItemResultDTO `json:"items"`
}
