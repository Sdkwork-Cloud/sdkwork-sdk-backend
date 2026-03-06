package types

// API密钥VO类，用于传输系统中API访问凭证信息
type PlusApiKeyVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Name string `json:"name"`
	KeyValue string `json:"keyValue"`
	MaskedKeyValue string `json:"maskedKeyValue"`
	Type string `json:"type"`
	Status string `json:"status"`
	ExpireTime string `json:"expireTime"`
	Description string `json:"description"`
	LastUsedTime string `json:"lastUsedTime"`
}
