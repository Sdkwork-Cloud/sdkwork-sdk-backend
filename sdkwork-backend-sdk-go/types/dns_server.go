package types


type DnsServer struct {
	Address string `json:"address"`
	Port int `json:"port"`
	Type string `json:"type"`
	Priority int `json:"priority"`
	Enabled bool `json:"enabled"`
}
