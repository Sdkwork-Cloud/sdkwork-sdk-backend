package types

// Vote creation form
type ContentVoteForm struct {
	ContentType string `json:"contentType"`
	Rating string `json:"rating"`
	ContentId int `json:"contentId"`
	Metadata ContentVoteMetadata `json:"metadata"`
}
