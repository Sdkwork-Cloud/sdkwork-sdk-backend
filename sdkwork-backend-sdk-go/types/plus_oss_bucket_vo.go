package types

// OSS存储桶值对象
type PlusOssBucketVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	V int `json:"v"`
	UserId int `json:"userId"`
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
