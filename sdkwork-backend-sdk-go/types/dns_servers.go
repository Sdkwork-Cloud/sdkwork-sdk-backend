package types


type DnsServers struct {
	Servers []DnsServer `json:"servers"`
	Empty bool `json:"empty"`
}
