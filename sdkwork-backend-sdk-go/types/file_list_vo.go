package types

// 文件列表视图对象
type FileListVO struct {
	Data []FileItemVO `json:"data"`
	Object string `json:"object"`
}
