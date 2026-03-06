package types

// Form for creating a chapter or directory
type CreateChapterForm struct {
	ContentWorkId int `json:"contentWorkId"`
	ParentDirectoryId int `json:"parentDirectoryId"`
	FileName string `json:"fileName"`
	IsDirectory bool `json:"isDirectory"`
	Content string `json:"content"`
}
