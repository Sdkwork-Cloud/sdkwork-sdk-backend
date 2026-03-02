package types

// Feeds流VO对象，支持通用内容展示，包括新闻资讯、博客、视频、图片、音频等多种类型
type PlusFeedsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	UserId int `json:"userId"`
	Title string `json:"title"`
	Summary string `json:"summary"`
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	CoverImages ImageMediaResourceList `json:"coverImages"`
	ResourceList AssetMediaResourceList `json:"resourceList"`
	Author AuthorInfo `json:"author"`
	Source string `json:"source"`
	PublishTime string `json:"publishTime"`
	Tags TagsContent `json:"tags"`
	Status string `json:"status"`
	ViewCount int `json:"viewCount"`
	LikeCount int `json:"likeCount"`
	CommentCount int `json:"commentCount"`
}
