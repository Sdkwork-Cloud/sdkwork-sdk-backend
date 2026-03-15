package types


type SceneContent struct {
	Scenes []string `json:"scenes"`
	Children []SceneContent `json:"children"`
}
