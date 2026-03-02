package types

// Video shot item
type VideoShotItem struct {
	Id string `json:"id"`
	Uuid string `json:"uuid"`
	ShotPrompt string `json:"shotPrompt"`
	Dialogue string `json:"dialogue"`
	Duration float64 `json:"duration"`
	StartFrame ImageMediaResource `json:"startFrame"`
	EndFrame ImageMediaResource `json:"endFrame"`
	Image ImageMediaResource `json:"image"`
	ResourceList AssetMediaResourceList `json:"resourceList"`
	Emotion string `json:"emotion"`
	VideoDescription string `json:"videoDescription"`
	Video VideoMediaResource `json:"video"`
}
