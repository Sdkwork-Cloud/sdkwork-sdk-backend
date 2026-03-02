package types

// 元素通用属性
type PPTBaseElement struct {
	Id string `json:"id"`
	Left int `json:"left"`
	Top int `json:"top"`
	Lock bool `json:"lock"`
	GroupId string `json:"groupId"`
	Width int `json:"width"`
	Height int `json:"height"`
	Rotate int `json:"rotate"`
	Link PPTElementLink `json:"link"`
	Name string `json:"name"`
}
