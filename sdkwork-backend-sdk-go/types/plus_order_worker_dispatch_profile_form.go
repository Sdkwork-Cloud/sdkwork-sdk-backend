package types

// Worker dispatch profile form
type PlusOrderWorkerDispatchProfileForm struct {
	UserId int `json:"userId"`
	RatingLevel string `json:"ratingLevel"`
	Enabled bool `json:"enabled"`
	GlobalMaxInProgress int `json:"globalMaxInProgress"`
	Metadata OrderWorkerDispatchMetadata `json:"metadata"`
}
