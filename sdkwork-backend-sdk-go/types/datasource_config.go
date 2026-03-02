package types


type DatasourceConfig struct {
	Type string `json:"type"`
	Host string `json:"host"`
	Port int `json:"port"`
	Database string `json:"database"`
	Username string `json:"username"`
	Password string `json:"password"`
	Params string `json:"params"`
	PoolConfig PoolConfig `json:"poolConfig"`
	DriverClassName string `json:"driverClassName"`
	JdbcUrl string `json:"jdbcUrl"`
}
