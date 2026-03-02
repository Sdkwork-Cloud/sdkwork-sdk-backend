package types

// IM视频消息内容类
type MsgVideoContent struct {
	Content string `json:"content"`
	Resource VideoMediaResource `json:"resource"`
}
