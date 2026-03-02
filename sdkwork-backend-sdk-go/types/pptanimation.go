package types

// 元素动画
type PPTAnimation struct {
	Id string `json:"id"`
	ElId string `json:"elId"`
	Effect string `json:"effect"`
	Type PPTAnimationType `json:"type"`
	Duration int `json:"duration"`
	Trigger PPTAnimationTrigger `json:"trigger"`
}
