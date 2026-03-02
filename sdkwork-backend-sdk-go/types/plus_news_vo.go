package types

// 新闻资讯VO对象
type PlusNewsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	UserId int `json:"userId"`
	Title string `json:"title"`
	Url string `json:"url"`
	Source string `json:"source"`
	Summary string `json:"summary"`
	PublishTime string `json:"publishTime"`
	Tags TagsContent `json:"tags"`
}
