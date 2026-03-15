package types


type FileContentObject struct {
	SchemaVersion string `json:"schemaVersion"`
	Source string `json:"source"`
	Text string `json:"text"`
	Contents map[string]string `json:"contents"`
	Metadata map[string]interface{} `json:"metadata"`
	Generation GenerationContext `json:"generation"`
	Segments []ContentSegment `json:"segments"`
	References []AssetReference `json:"references"`
}
