package types


type Media struct {
	Id string `json:"id"`
	MimeType MimeType `json:"mimeType"`
	Data interface{} `json:"data"`
	Name string `json:"name"`
	DataAsByteArray string `json:"dataAsByteArray"`
}
