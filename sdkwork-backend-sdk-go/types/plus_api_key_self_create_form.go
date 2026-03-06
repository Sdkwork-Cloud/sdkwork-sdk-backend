package types

// 开发者自助创建API Key请求
type PlusApiKeySelfCreateForm struct {
	Name string `json:"name"`
	Type string `json:"type"`
	ExpireTime string `json:"expireTime"`
	Description string `json:"description"`
}
