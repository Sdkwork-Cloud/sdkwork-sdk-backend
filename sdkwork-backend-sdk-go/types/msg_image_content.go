package types

// IM图片消息内容类
type MsgImageContent struct {
	Content string `json:"content"`
	Resource ImageMediaResource `json:"resource"`
}
