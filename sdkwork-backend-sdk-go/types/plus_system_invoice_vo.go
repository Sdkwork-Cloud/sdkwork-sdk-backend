package types

// 系统发票VO
type PlusSystemInvoiceVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Title string `json:"title"`
	TaxId string `json:"taxId"`
	Type string `json:"type"`
	Amount float64 `json:"amount"`
	Status string `json:"status"`
	Content string `json:"content"`
	Email string `json:"email"`
	Address string `json:"address"`
	CreateTime string `json:"createTime"`
}
