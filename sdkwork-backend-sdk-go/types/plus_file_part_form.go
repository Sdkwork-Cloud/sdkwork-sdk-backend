package types

// File part creation form
type PlusFilePartForm struct {
	FileId int `json:"fileId"`
	ChunkIndex int `json:"chunkIndex"`
	ChunkSize int `json:"chunkSize"`
	TotalSize int `json:"totalSize"`
	Checksum string `json:"checksum"`
	Status int `json:"status"`
	StoragePath string `json:"storagePath"`
}
