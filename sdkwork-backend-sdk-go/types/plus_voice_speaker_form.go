package types

// Voice speaker creation form
type PlusVoiceSpeakerForm struct {
	Name string `json:"name"`
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
