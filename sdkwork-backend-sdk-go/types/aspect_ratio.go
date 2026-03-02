package types

// 视频/图像生成的宽高比例配置
type AspectRatio struct {
	Ratio string `json:"ratio"`
	Width float64 `json:"width"`
	Height float64 `json:"height"`
}
