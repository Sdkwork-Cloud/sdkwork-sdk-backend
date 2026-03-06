package types

// 二维码确认登录请求
type QrCodeConfirmForm struct {
	QrKey string `json:"qrKey"`
	Token string `json:"token"`
}
