package types

// System invoice application form
type PlusSystemInvoiceApplyForm struct {
	Title string `json:"title"`
	TaxId string `json:"taxId"`
	Type string `json:"type"`
	Amount float64 `json:"amount"`
	Content string `json:"content"`
	Email string `json:"email"`
	Address string `json:"address"`
}
