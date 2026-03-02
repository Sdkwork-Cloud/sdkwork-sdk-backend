package types

// 音频媒体资源列表
type AudioMediaResourceList struct {
	Audios []AudioMediaResource `json:"audios"`
	Resources []AssetMediaResource `json:"resources"`
}
