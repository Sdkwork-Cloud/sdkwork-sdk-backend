package types

// 存储桶对象，包含名称和区域信息
type BucketObject struct {
	Name string `json:"name"`
	Region string `json:"region"`
	CreationDate string `json:"creationDate"`
	Arn string `json:"arn"`
}
