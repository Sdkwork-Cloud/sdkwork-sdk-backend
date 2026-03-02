package types

// 批注
type PPTNote struct {
	Id string `json:"id"`
	Content string `json:"content"`
	Time int `json:"time"`
	User string `json:"user"`
	ElId string `json:"elId"`
	Replies []PPTNoteReply `json:"replies"`
}
