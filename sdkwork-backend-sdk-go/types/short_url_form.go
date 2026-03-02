package types

// Short URL creation parameters
type ShortUrlForm struct {
	OriginalUrl string `json:"originalUrl"`
	ShortCode string `json:"shortCode"`
	ExpiresAt string `json:"expiresAt"`
	Status string `json:"status"`
	CreatedBy int `json:"createdBy"`
	Description string `json:"description"`
}
