package types

// Article creation form
type PlusArticleForm struct {
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
