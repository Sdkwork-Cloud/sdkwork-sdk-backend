package types

// OAuth login request form
type OAuthLoginRequestForm struct {
	Provider string `json:"provider"`
	RedirectUri string `json:"redirectUri"`
	Scope string `json:"scope"`
	State string `json:"state"`
}
