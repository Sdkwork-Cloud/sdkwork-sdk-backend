package types


type ContentSegment struct {
	Id string `json:"id"`
	Order int `json:"order"`
	Type string `json:"type"`
	Text string `json:"text"`
	StartMs int `json:"startMs"`
	EndMs int `json:"endMs"`
	Metadata map[string]interface{} `json:"metadata"`
}
