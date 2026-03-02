package types

// 视频媒体资源列表
type VideoMediaResourceList struct {
	Videos []VideoMediaResource `json:"videos"`
	Resources []AssetMediaResource `json:"resources"`
}
