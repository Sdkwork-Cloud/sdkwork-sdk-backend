package types

// 文件内容VO（与PlusFile一对一对应，存储文件的文本内容和编码信息）
type PlusFileContentVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	FileId int `json:"fileId"`
	FileUuid string `json:"fileUuid"`
	Prompt string `json:"prompt"`
	Encoding string `json:"encoding"`
	Content FileContentObject `json:"content"`
}
