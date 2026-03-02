package types

// Feeds creation form
type PlusFeedsForm struct {
	Title string `json:"title"`
	Summary string `json:"summary"`
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	CoverImages ImageMediaResourceList `json:"coverImages"`
	Source string `json:"source"`
	PublishTime string `json:"publishTime"`
	Tags TagsContent `json:"tags"`
	Status string `json:"status"`
	ViewCount int `json:"viewCount"`
	LikeCount int `json:"likeCount"`
	CommentCount int `json:"commentCount"`
}
