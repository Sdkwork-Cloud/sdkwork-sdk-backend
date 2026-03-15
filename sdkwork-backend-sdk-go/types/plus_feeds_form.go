package types

// Feeds creation form
type PlusFeedsForm struct {
	Title string `json:"title"`
	Summary string `json:"summary"`
	CategoryId int `json:"categoryId"`
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	CoverImages ImageMediaResourceList `json:"coverImages"`
	Source string `json:"source"`
	PublishTime string `json:"publishTime"`
	Tags TagsContent `json:"tags"`
	Status string `json:"status"`
}
