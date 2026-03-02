package types


type GroupInfo struct {
	Id string `json:"id"`
	Object string `json:"object"`
	Created int `json:"created"`
	Model string `json:"model"`
	SystemFingerprint string `json:"systemFingerprint"`
	Metadata ChatCompletionMetadata `json:"metadata"`
	Agent PlusAgent `json:"agent"`
}
