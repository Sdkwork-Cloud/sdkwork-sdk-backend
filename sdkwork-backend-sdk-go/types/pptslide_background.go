package types

// 幻灯片背景
type PPTSlideBackground struct {
	Type PPTSlideBackgroundType `json:"type"`
	Color string `json:"color"`
	Image PPTSlideBackgroundImage `json:"image"`
	Pptgradient PPTGradient `json:"pptgradient"`
}
