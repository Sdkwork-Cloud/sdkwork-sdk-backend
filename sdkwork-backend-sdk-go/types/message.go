package types


type Message struct {
	MessageType string `json:"messageType"`
	Text string `json:"text"`
	Metadata map[string]interface{} `json:"metadata"`
}
