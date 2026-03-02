package types

// PPT项目信息
type PlusPptProject struct {
	Id string `json:"id"`
	Uuid string `json:"uuid"`
	Type string `json:"type"`
	ScreenType string `json:"screenType"`
	Name string `json:"name"`
	Title string `json:"title"`
	Owner string `json:"owner"`
	OwnerId int `json:"ownerId"`
	DiskId int `json:"diskId"`
	Files []PlusFileObject `json:"files"`
	Author string `json:"author"`
	CreatedAt string `json:"createdAt"`
	LastModifiedTime string `json:"lastModifiedTime"`
	Version string `json:"version"`
	Prompt string `json:"prompt"`
	Description string `json:"description"`
	Tags TagsContent `json:"tags"`
	Width float64 `json:"width"`
	Height float64 `json:"height"`
	Slides []PlusPptSlide `json:"slides"`
	Theme PlusPptTheme `json:"theme"`
	Context PlusPptContext `json:"context"`
	Subtitle string `json:"subtitle"`
	IncludePageNumbers bool `json:"includePageNumbers"`
	IncludeFooter bool `json:"includeFooter"`
	FooterText string `json:"footerText"`
	ExportFormat string `json:"exportFormat"`
}
