package types

// 分享VO
type PlusShareVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
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
