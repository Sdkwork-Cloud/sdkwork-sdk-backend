package types

// IM文件消息内容类
type MsgFileContent struct {
	Content string `json:"content"`
	Resource FileMediaResource `json:"resource"`
}
