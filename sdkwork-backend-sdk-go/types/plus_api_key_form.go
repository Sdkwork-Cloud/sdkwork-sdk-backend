package types

// API key creation form
type PlusApiKeyForm struct {
	Name string `json:"name"`
	KeyValue string `json:"keyValue"`
	Type string `json:"type"`
	Status string `json:"status"`
	ExpireTime string `json:"expireTime"`
	Description string `json:"description"`
	LastUsedTime string `json:"lastUsedTime"`
}
