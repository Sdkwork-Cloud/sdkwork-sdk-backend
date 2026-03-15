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
	Author string `json:"author"`
	DiskId int `json:"diskId"`
	Title string `json:"title"`
	Uuid string `json:"uuid"`
	OwnerId int `json:"ownerId"`
	CreatedAt string `json:"createdAt"`
	Files []PlusFileObject `json:"files"`
	ScreenType string `json:"screenType"`
}
