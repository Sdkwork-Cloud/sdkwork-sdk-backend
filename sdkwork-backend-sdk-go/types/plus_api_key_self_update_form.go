package types

// 开发者自助更新API Key请求
type PlusApiKeySelfUpdateForm struct {
	Name string `json:"name"`
	ExpireTime string `json:"expireTime"`
	ClearExpireTime bool `json:"clearExpireTime"`
	Description string `json:"description"`
}
