package types

// 文件VO类，用于存储文件的元数据信息
type PlusTempSessionVO struct {
	FileId int `json:"fileId"`
	TmpAccessKeyId string `json:"tmpAccessKeyId"`
	TmpAccessKeySecret string `json:"tmpAccessKeySecret"`
	SessionToken string `json:"sessionToken"`
	ExpirationSeconds int `json:"expirationSeconds"`
	UploadUrl string `json:"uploadUrl"`
	ObjectKey string `json:"objectKey"`
	Bucket BucketObject `json:"bucket"`
	CreateTime string `json:"createTime"`
}
