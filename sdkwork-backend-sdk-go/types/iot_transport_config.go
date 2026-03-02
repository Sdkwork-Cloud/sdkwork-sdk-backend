package types

// IoT transport configuration
type IotTransportConfig struct {
	Type string `json:"type"`
	Url string `json:"url"`
	ConnectionTimeout int `json:"connectionTimeout"`
	KeepAliveInterval int `json:"keepAliveInterval"`
	Qos int `json:"qos"`
	ClientId string `json:"clientId"`
	AuthToken string `json:"authToken"`
	Username string `json:"username"`
	Password string `json:"password"`
	SslEnabled bool `json:"sslEnabled"`
	CleanSession bool `json:"cleanSession"`
	WillTopic string `json:"willTopic"`
	WillMessage string `json:"willMessage"`
	WillQos int `json:"willQos"`
	WillRetain bool `json:"willRetain"`
	PublishTopics []string `json:"publishTopics"`
	SubscribeTopics []string `json:"subscribeTopics"`
}
