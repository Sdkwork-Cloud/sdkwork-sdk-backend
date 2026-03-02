package types


type TagsContent struct {
	Tags []string `json:"tags"`
	Children []TagsContent `json:"children"`
}
