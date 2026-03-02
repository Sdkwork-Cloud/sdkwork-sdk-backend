package types

// IoT account configuration
type IotAccountConfig struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Region string `json:"region"`
	Weight int `json:"weight"`
	Channel string `json:"channel"`
	Product string `json:"product"`
	Functions []string `json:"functions"`
	Metadata AccountConfigMetadata `json:"metadata"`
	Properties map[string]interface{} `json:"properties"`
	Transports []IotTransportConfig `json:"transports"`
	FirmwareDownloadUrl string `json:"firmwareDownloadUrl"`
	OtaUpgradeUrl string `json:"otaUpgradeUrl"`
	DeviceRegistryUrl string `json:"deviceRegistryUrl"`
	CertificatePath string `json:"certificatePath"`
	PrivateKeyPath string `json:"privateKeyPath"`
	CaCertificatePath string `json:"caCertificatePath"`
	ReportingInterval int `json:"reportingInterval"`
	MaxRetryAttempts int `json:"maxRetryAttempts"`
	RetryInterval int `json:"retryInterval"`
}
