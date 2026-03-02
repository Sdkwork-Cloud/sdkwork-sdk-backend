package types

// IM音频消息内容类
type MsgAudioContent struct {
	Content string `json:"content"`
	Resource AudioMediaResource `json:"resource"`
}
