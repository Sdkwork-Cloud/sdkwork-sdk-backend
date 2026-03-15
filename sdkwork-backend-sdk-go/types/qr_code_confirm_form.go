package types

// QR code confirmation form
type QrCodeConfirmForm struct {
	QrKey string `json:"qrKey"`
	Token string `json:"token"`
}
