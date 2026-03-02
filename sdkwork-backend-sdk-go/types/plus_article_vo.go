package types

// AI生成文章VO对象
type PlusArticleVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Title string `json:"title"`
	Subtitle string `json:"subtitle"`
	Content string `json:"content"`
	WordCount int `json:"wordCount"`
	ReadingTime int `json:"readingTime"`
	CoverImages ImageMediaResourceList `json:"coverImages"`
	Author AuthorInfo `json:"author"`
	Source string `json:"source"`
	Status string `json:"status"`
	Keywords []string `json:"keywords"`
	Summary string `json:"summary"`
}
