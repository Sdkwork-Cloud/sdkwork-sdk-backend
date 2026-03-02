package types

// 批注回复
type PPTNoteReply struct {
	Id string `json:"id"`
	Content string `json:"content"`
	Time int `json:"time"`
	User string `json:"user"`
}
