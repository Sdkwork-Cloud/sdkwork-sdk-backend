package types

// 渐变
type PPTGradient struct {
	Type PPTGradientType `json:"type"`
	Colors []PPTGradientColor `json:"colors"`
	Rotate int `json:"rotate"`
}
