package types

// Video storyboard
type VideoStoryboard struct {
	Shots []VideoShotItem `json:"shots"`
	FinalVideo VideoMediaResource `json:"finalVideo"`
	FinalAudio AudioMediaResource `json:"finalAudio"`
	Title string `json:"title"`
	Description string `json:"description"`
	Style string `json:"style"`
	AspectRatio string `json:"aspectRatio"`
	Prompt string `json:"prompt"`
	Duration float64 `json:"duration"`
	Speaker VoiceSpeakerInfo `json:"speaker"`
}
