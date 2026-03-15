package types


type PageInvitationRelationVO struct {
	TotalElements int `json:"totalElements"`
	TotalPages int `json:"totalPages"`
	Size int `json:"size"`
	Content []InvitationRelationVO `json:"content"`
	Number int `json:"number"`
	NumberOfElements int `json:"numberOfElements"`
	Sort SortObject `json:"sort"`
	Pageable PageableObject `json:"pageable"`
	First bool `json:"first"`
	Last bool `json:"last"`
	Empty bool `json:"empty"`
}
