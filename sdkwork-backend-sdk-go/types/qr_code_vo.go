package types

// 二维码生成响应
type QrCodeVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	QrKey string `json:"qrKey"`
	QrUrl string `json:"qrUrl"`
	QrContent string `json:"qrContent"`
	ExpireTime int `json:"expireTime"`
}
