package types


type PlusProjectObject struct {
	Name string `json:"name"`
	Id string `json:"id"`
	Type string `json:"type"`
	Owner string `json:"owner"`
	LastModifiedTime string `json:"lastModifiedTime"`
	Version string `json:"version"`
	Tags TagsContent `json:"tags"`
	Description string `json:"description"`
	Title string `json:"title"`
	CreatedAt string `json:"createdAt"`
	OwnerId int `json:"ownerId"`
	Uuid string `json:"uuid"`
	DiskId int `json:"diskId"`
	Author string `json:"author"`
	Files []PlusFileObject `json:"files"`
	ScreenType string `json:"screenType"`
}
