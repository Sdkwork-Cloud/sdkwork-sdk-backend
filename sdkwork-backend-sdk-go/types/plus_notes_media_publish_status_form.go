package types

// P lu sN ot es Me di aP ub li sh St at us Fo rm
type PlusNotesMediaPublishStatusForm struct {
	UserId int `json:"userId"`
	Platform string `json:"platform"`
	Product string `json:"product"`
	PublishId string `json:"publishId"`
}
