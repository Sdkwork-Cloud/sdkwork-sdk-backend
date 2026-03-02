package types

// 媒体资源列表
type AssetMediaResourceList struct {
	Images []ImageMediaResource `json:"images"`
	Videos []VideoMediaResource `json:"videos"`
	Audios []AudioMediaResource `json:"audios"`
	Files []FileMediaResource `json:"files"`
	Musics []MusicMediaResource `json:"musics"`
	Resources []AssetMediaResource `json:"resources"`
}
