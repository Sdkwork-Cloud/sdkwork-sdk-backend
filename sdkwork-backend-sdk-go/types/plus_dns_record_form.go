package types

// DNS record creation form
type PlusDnsRecordForm struct {
	DomainId int `json:"domainId"`
	RecordName string `json:"recordName"`
	FileName string `json:"fileName"`
	FileContent string `json:"fileContent"`
	RecordType string `json:"recordType"`
	RecordValue DnsRecordValue `json:"recordValue"`
	Ttl int `json:"ttl"`
	Priority int `json:"priority"`
	Enabled bool `json:"enabled"`
}
