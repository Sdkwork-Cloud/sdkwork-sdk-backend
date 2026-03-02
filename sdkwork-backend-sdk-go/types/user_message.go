package types


type UserMessage struct {
	MessageType string `json:"messageType"`
	Metadata map[string]interface{} `json:"metadata"`
	Media []Media `json:"media"`
	Text string `json:"text"`
}
