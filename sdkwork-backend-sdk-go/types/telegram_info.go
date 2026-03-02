package types


type TelegramInfo struct {
	UserId int `json:"userId"`
	Username string `json:"username"`
	FullName string `json:"fullName"`
	PhoneNumber string `json:"phoneNumber"`
	LanguageCode string `json:"languageCode"`
}
