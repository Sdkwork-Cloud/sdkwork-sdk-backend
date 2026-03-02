package types

// 内容投票数据传输对象
type ContentVoteVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	V int `json:"v"`
	UserId int `json:"userId"`
	ContentType string `json:"contentType"`
	Rating string `json:"rating"`
	ContentId int `json:"contentId"`
	Metadata ContentVoteMetadata `json:"metadata"`
}
