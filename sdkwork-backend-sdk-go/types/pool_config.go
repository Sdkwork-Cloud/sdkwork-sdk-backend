package types


type PoolConfig struct {
	MinIdle int `json:"minIdle"`
	MaxPoolSize int `json:"maxPoolSize"`
	ConnectionTimeout int `json:"connectionTimeout"`
	IdleTimeout int `json:"idleTimeout"`
	MaxLifetime int `json:"maxLifetime"`
	AutoCommit bool `json:"autoCommit"`
	ConnectionTestQuery string `json:"connectionTestQuery"`
	PoolName string `json:"poolName"`
}
