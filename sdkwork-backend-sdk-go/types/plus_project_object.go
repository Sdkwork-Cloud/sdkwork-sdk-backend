package types


type PlusProjectObject struct {
	Name string `json:"name"`
	Id string `json:"id"`
	Type string `json:"type"`
	Owner string `json:"owner"`
	LastModifiedTime string `json:"lastModifiedTime"`
	Version string `json:"version"`
	Files []PlusFileObject `json:"files"`
	Uuid string `json:"uuid"`
	DiskId int `json:"diskId"`
	Author string `json:"author"`
	OwnerId int `json:"ownerId"`
	CreatedAt string `json:"createdAt"`
	ScreenType string `json:"screenType"`
	Description string `json:"description"`
	Tags TagsContent `json:"tags"`
	Title string `json:"title"`
}
