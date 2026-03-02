package types

// IM位置消息内容类
type MsgLocationContent struct {
	Content string `json:"content"`
	Location GeoPoint `json:"location"`
	Address string `json:"address"`
	Name string `json:"name"`
	Radius float64 `json:"radius"`
}
