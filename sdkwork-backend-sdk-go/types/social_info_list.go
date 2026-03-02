package types


type SocialInfoList struct {
	Wechat WechatInfo `json:"wechat"`
	Facebook FacebookInfo `json:"facebook"`
	Twitter TwitterInfo `json:"twitter"`
	Instagram InstagramInfo `json:"instagram"`
	Linkedin LinkedInInfo `json:"linkedin"`
	Telegram TelegramInfo `json:"telegram"`
	Whatsapp WhatsAppInfo `json:"whatsapp"`
	Tiktok TikTokInfo `json:"tiktok"`
}
