package types

// File content creation form
type PlusFileContentForm struct {
	FileId int `json:"fileId"`
	FileUuid string `json:"fileUuid"`
	Prompt string `json:"prompt"`
	Encoding string `json:"encoding"`
	Content FileContentObject `json:"content"`
}
