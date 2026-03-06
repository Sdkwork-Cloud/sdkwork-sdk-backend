package types


type MimeType struct {
	Type string `json:"type"`
	Subtype string `json:"subtype"`
	Parameters map[string]string `json:"parameters"`
	Charset string `json:"charset"`
	Concrete bool `json:"concrete"`
	SubtypeSuffix string `json:"subtypeSuffix"`
	WildcardType bool `json:"wildcardType"`
	WildcardSubtype bool `json:"wildcardSubtype"`
}
