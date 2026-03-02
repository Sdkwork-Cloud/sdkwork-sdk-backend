package types

// PPT幻灯片信息
type PlusPptSlide struct {
	Id string `json:"id"`
	Elements []PPTBaseElement `json:"elements"`
	Notes []PPTNote `json:"notes"`
	Remark string `json:"remark"`
	Background PPTSlideBackground `json:"background"`
	Animations []PPTAnimation `json:"animations"`
	TurningMode PPTTurningMode `json:"turningMode"`
	SectionTag PPTSectionTag `json:"sectionTag"`
	Type PPTSlideType `json:"type"`
	Payload PlusPptPayload `json:"payload"`
}
