package types

// Worker dispatch profile view object
type PlusOrderWorkerDispatchProfileVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	UserId int `json:"userId"`
	RatingLevel string `json:"ratingLevel"`
	Enabled bool `json:"enabled"`
	GlobalMaxInProgress int `json:"globalMaxInProgress"`
	Metadata OrderWorkerDispatchMetadata `json:"metadata"`
}
