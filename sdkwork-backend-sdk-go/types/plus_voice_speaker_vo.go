package types

// 语音发音人VO
type PlusVoiceSpeakerVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	Voice string `json:"voice"`
	ChannelSpeakerId string `json:"channelSpeakerId"`
	Code string `json:"code"`
	Channel string `json:"channel"`
	Gender string `json:"gender"`
	AgeType string `json:"ageType"`
	Type string `json:"type"`
	Models []string `json:"models"`
	Tags TagsContent `json:"tags"`
	Status string `json:"status"`
	Description string `json:"description"`
}
