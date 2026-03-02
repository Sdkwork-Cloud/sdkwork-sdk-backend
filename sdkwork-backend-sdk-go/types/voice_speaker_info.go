package types


type VoiceSpeakerInfo struct {
	Channel string `json:"channel"`
	Provider string `json:"provider"`
	Product string `json:"product"`
	Id string `json:"id"`
	Models []string `json:"models"`
	SpeakerId string `json:"speakerId"`
	DisplayName string `json:"displayName"`
	Tags TagsContent `json:"tags"`
	Motion VoiceMotion `json:"motion"`
	Style VoiceStyle `json:"style"`
	Description string `json:"description"`
}
