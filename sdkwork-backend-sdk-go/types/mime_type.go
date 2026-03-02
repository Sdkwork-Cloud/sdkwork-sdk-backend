package types


type MimeType struct {
	Type string `json:"type"`
	Subtype string `json:"subtype"`
	Parameters map[string]string `json:"parameters"`
	Charset string `json:"charset"`
	Concrete bool `json:"concrete"`
	WildcardSubtype bool `json:"wildcardSubtype"`
	WildcardType bool `json:"wildcardType"`
	SubtypeSuffix string `json:"subtypeSuffix"`
}
