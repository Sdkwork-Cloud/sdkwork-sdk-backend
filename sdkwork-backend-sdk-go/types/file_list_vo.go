package types

// File list view object
type FileListVO struct {
	Data []FileItemVO `json:"data"`
	Object string `json:"object"`
}
