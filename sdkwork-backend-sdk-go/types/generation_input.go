package types

// AI生成任务输入参数统一入口
type GenerationInput struct {
	Type string `json:"type"`
	Image ImageGenerationInput `json:"image"`
	Video VideoGenerationInput `json:"video"`
	Audio AudioGenerationInput `json:"audio"`
	Music MusicGenerationInput `json:"music"`
	Character CharacterGenerationInput `json:"character"`
	VoiceSpeaker VoiceSpeakerGenerationInput `json:"voiceSpeaker"`
	AudioEffect AudioEffectGenerationInput `json:"audioEffect"`
	Input BaseGenerationInput `json:"input"`
	Prompt string `json:"prompt"`
}
