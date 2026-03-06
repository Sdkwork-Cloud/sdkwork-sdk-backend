package types

// File item view object
type FileItemVO struct {
	Id string `json:"id"`
	Object string `json:"object"`
	Bytes int `json:"bytes"`
	CreatedAt int `json:"createdAt"`
	Filename string `json:"filename"`
	Purpose string `json:"purpose"`
	ExpiresAt int `json:"expiresAt"`
	Status string `json:"status"`
	StatusDetails string `json:"statusDetails"`
	Deleted bool `json:"deleted"`
}
