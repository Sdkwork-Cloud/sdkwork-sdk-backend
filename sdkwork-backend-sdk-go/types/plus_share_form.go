package types

// 分享创建表单
type PlusShareForm struct {
	Title string `json:"title"`
	Description string `json:"description"`
	Type string `json:"type"`
	Contents ShareContents `json:"contents"`
	ContentType string `json:"contentType"`
	Status string `json:"status"`
	ShareUrl string `json:"shareUrl"`
	ContentIds []string `json:"contentIds"`
	Password string `json:"password"`
	ExpireAt string `json:"expireAt"`
	ClickCount int `json:"clickCount"`
	Tags TagsContent `json:"tags"`
	ShareCode string `json:"shareCode"`
}
