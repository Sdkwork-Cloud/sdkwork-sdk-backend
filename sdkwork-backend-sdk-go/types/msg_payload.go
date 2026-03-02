package types

// IM消息载体类
type MsgPayload struct {
	Audio MsgAudioContent `json:"audio"`
	File MsgFileContent `json:"file"`
	Image MsgImageContent `json:"image"`
	Location MsgLocationContent `json:"location"`
	Music MsgMusicContent `json:"music"`
	Text MsgTextContent `json:"text"`
	Video MsgVideoContent `json:"video"`
}
