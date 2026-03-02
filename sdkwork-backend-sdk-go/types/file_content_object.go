package types


type FileContentObject struct {
	Text string `json:"text"`
	Contents map[string]string `json:"contents"`
}
