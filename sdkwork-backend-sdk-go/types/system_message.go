package types


type SystemMessage struct {
	MessageType string `json:"messageType"`
	Metadata map[string]interface{} `json:"metadata"`
	Text string `json:"text"`
}
