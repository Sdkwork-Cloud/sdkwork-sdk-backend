package types

// Short URL VO (stores short URL metadata and access statistics)
type ShortUrlVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	OriginalUrl string `json:"originalUrl"`
	ShortCode string `json:"shortCode"`
	ExpiresAt string `json:"expiresAt"`
	ClickCount int `json:"clickCount"`
	Status string `json:"status"`
	CreatedBy int `json:"createdBy"`
	Description string `json:"description"`
}
