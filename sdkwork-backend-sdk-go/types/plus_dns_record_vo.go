package types

// DNS解析记录VO
type PlusDnsRecordVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	DomainId int `json:"domainId"`
	RecordName string `json:"recordName"`
	FileName string `json:"fileName"`
	FileContent string `json:"fileContent"`
	RecordType string `json:"recordType"`
	RecordValue DnsRecordValue `json:"recordValue"`
	Ttl int `json:"ttl"`
	Priority int `json:"priority"`
	Enabled bool `json:"enabled"`
	RecordValues []string `json:"recordValues"`
	FirstRecordValue string `json:"firstRecordValue"`
}
