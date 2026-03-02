package types


type DnsRecordValue struct {
	Values []string `json:"values"`
	Empty bool `json:"empty"`
	FirstValue string `json:"firstValue"`
}
