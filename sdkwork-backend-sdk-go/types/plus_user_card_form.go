package types

// User-card binding creation form
type PlusUserCardForm struct {
	UserId int `json:"userId"`
	CardId int `json:"cardId"`
	CardCode string `json:"cardCode"`
	AcquireTime string `json:"acquireTime"`
	ActivateTime string `json:"activateTime"`
	CancelTime string `json:"cancelTime"`
	Points int `json:"points"`
	Balance int `json:"balance"`
}
