package types

// Content statistics VO
type ContentStatsVO struct {
	WordCount int `json:"wordCount"`
	ChapterCount int `json:"chapterCount"`
	FileSize int `json:"fileSize"`
}
