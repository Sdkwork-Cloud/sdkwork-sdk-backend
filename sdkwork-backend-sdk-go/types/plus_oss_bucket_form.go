package types

// OSS bucket creation form
type PlusOssBucketForm struct {
	Name string `json:"name"`
	Region string `json:"region"`
	Channel string `json:"channel"`
	ChannelConfigId int `json:"channelConfigId"`
	Description string `json:"description"`
	Status string `json:"status"`
	CreationDate string `json:"creationDate"`
	Arn string `json:"arn"`
	Endpoint string `json:"endpoint"`
	StorageClass string `json:"storageClass"`
	VersioningEnabled bool `json:"versioningEnabled"`
	EncryptionEnabled bool `json:"encryptionEnabled"`
	EncryptionType string `json:"encryptionType"`
	Acl string `json:"acl"`
}
