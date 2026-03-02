package types


type OAuthLoginResponse struct {
	Provider string `json:"provider"`
	AuthUrl string `json:"authUrl"`
	State string `json:"state"`
	ExpiresIn int `json:"expiresIn"`
}
