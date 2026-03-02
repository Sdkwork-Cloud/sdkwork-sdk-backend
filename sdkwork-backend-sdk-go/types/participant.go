package types

// 消息参与者实体类
type Participant struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	OpenId string `json:"openId"`
	UnionId string `json:"unionId"`
	Name string `json:"name"`
	Face ImageMediaResource `json:"face"`
	DeviceId int `json:"deviceId"`
	DeviceUuid string `json:"deviceUuid"`
	Device bool `json:"device"`
}
