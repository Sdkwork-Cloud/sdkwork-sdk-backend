package types

// AI生成任务输入参数
type GenerationInputParams struct {
	Image ImageGenerationInput `json:"image"`
	Video VideoGenerationInput `json:"video"`
	Audio AudioGenerationInput `json:"audio"`
	Music MusicGenerationInput `json:"music"`
	Voice VoiceSpeakerGenerationInput `json:"voice"`
	Character CharacterGenerationInput `json:"character"`
	AudioEffect AudioEffectGenerationInput `json:"audioEffect"`
}
