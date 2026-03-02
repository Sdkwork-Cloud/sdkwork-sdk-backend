package types

// 注册结果
type RegisterResultVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	User UserVO `json:"user"`
}
