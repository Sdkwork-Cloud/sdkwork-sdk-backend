package types

// OAuth callback form
type OAuthCallbackForm struct {
	Provider string `json:"provider"`
	Code string `json:"code"`
	State string `json:"state"`
}
