package types


type AssetReference struct {
	FileId int `json:"fileId"`
	FileUuid string `json:"fileUuid"`
	FilePath string `json:"filePath"`
	AssetType string `json:"assetType"`
	MimeType string `json:"mimeType"`
	Url string `json:"url"`
}
