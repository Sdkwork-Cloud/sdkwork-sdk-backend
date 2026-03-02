package types


type PlusTreeNodePlusCategoryVO struct {
	Data PlusCategoryVO `json:"data"`
	Parent PlusTreeNodePlusCategoryVO `json:"parent"`
	Children []PlusTreeNodePlusCategoryVO `json:"children"`
	Index int `json:"index"`
	Root bool `json:"root"`
	Leaf bool `json:"leaf"`
	ChildrenCount int `json:"childrenCount"`
	Depth int `json:"depth"`
}
