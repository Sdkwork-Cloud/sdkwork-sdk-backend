package types

// 元素超链接
type PPTElementLink struct {
	Type PPTElementLinkType `json:"type"`
	Target string `json:"target"`
}
