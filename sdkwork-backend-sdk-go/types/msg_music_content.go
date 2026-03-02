package types

// IM音乐消息内容类
type MsgMusicContent struct {
	Content string `json:"content"`
	Resource MusicMediaResource `json:"resource"`
	Title string `json:"title"`
	Artist string `json:"artist"`
	Album string `json:"album"`
	Duration int `json:"duration"`
}
