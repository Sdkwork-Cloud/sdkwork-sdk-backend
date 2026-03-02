package types


type PlusTreeNodePlusFileVO struct {
	Data PlusFileVO `json:"data"`
	Parent PlusTreeNodePlusFileVO `json:"parent"`
	Children []PlusTreeNodePlusFileVO `json:"children"`
	Index int `json:"index"`
	Root bool `json:"root"`
	Leaf bool `json:"leaf"`
	ChildrenCount int `json:"childrenCount"`
	Depth int `json:"depth"`
}
