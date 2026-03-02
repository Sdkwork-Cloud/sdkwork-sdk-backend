package types

// 文件分片VO对象
type PlusFilePartVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	FileId int `json:"fileId"`
	ChunkIndex int `json:"chunkIndex"`
	ChunkSize int `json:"chunkSize"`
	TotalSize int `json:"totalSize"`
	Checksum string `json:"checksum"`
	Status int `json:"status"`
	StoragePath string `json:"storagePath"`
}
