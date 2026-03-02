package types


type VectorAccountConfig struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Region string `json:"region"`
	Weight int `json:"weight"`
	Channel string `json:"channel"`
	Product string `json:"product"`
	Functions []string `json:"functions"`
	Metadata AccountConfigMetadata `json:"metadata"`
	Properties map[string]interface{} `json:"properties"`
	Dimension int `json:"dimension"`
	IndexType string `json:"indexType"`
	IndexName string `json:"indexName"`
	EmbeddingConfigId int `json:"embeddingConfigId"`
	DatabaseName string `json:"databaseName"`
	CollectionName string `json:"collectionName"`
	EmbeddingConfig EmbeddingAccountConfig `json:"embeddingConfig"`
}
