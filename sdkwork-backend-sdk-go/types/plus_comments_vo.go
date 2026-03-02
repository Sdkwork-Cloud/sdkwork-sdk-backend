package types

// 用户评论VO，支持新闻、文章、视频、图片、商品、帖子等任何内容类型的评论
type PlusCommentsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	ParentId int `json:"parentId"`
	ParentUuid string `json:"parentUuid"`
	UserId int `json:"userId"`
	Content string `json:"content"`
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	Status string `json:"status"`
	Likes int `json:"likes"`
	ReplyCount int `json:"replyCount"`
	IsTop bool `json:"isTop"`
	IpAddress string `json:"ipAddress"`
	DeviceInfo string `json:"deviceInfo"`
	Author AuthorInfo `json:"author"`
}
