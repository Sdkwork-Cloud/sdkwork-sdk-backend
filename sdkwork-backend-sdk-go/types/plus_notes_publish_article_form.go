package types

// 笔记发布文章表单
type PlusNotesPublishArticleForm struct {
	NoteId int `json:"noteId"`
	NoteUuid string `json:"noteUuid"`
	Title string `json:"title"`
	Content string `json:"content"`
	Digest string `json:"digest"`
	Author string `json:"author"`
	ThumbMediaId string `json:"thumbMediaId"`
	ContentSourceUrl string `json:"contentSourceUrl"`
	ShowCoverPic int `json:"showCoverPic"`
	NeedOpenComment int `json:"needOpenComment"`
	OnlyFansCanComment int `json:"onlyFansCanComment"`
}
