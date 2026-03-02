package types

// 语音说话人生成结果VO
type GenerateVoiceSpeakerVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RequestId string `json:"requestId"`
	TaskId string `json:"taskId"`
	TaskStatus string `json:"taskStatus"`
	VoiceResources AudioMediaResourceList `json:"voiceResources"`
	VoiceSpeakerId string `json:"voiceSpeakerId"`
	VoiceSpeakerName string `json:"voiceSpeakerName"`
	VoiceType string `json:"voiceType"`
	VoiceStyle string `json:"voiceStyle"`
	Model string `json:"model"`
	Duration int `json:"duration"`
	ErrorMessage string `json:"errorMessage"`
}
