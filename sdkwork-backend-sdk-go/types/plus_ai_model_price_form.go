package types

// Model price creation form
type PlusAiModelPriceForm struct {
	ObjectId string `json:"objectId"`
	Model string `json:"model"`
	Unit string `json:"unit"`
	Price float64 `json:"price"`
	InputPrice float64 `json:"inputPrice"`
	BatchInputPrice float64 `json:"batchInputPrice"`
	CachedInputPrice float64 `json:"cachedInputPrice"`
	BatchCachedInputPrice float64 `json:"batchCachedInputPrice"`
	OutputPrice float64 `json:"outputPrice"`
	BatchOutputPrice float64 `json:"batchOutputPrice"`
	Currency string `json:"currency"`
}
