package types

// News creation form
type PlusNewsForm struct {
	Title string `json:"title"`
	Url string `json:"url"`
	Source string `json:"source"`
	Summary string `json:"summary"`
	PublishTime string `json:"publishTime"`
	Tags TagsContent `json:"tags"`
	CategoryId int `json:"categoryId"`
	UserId int `json:"userId"`
}
