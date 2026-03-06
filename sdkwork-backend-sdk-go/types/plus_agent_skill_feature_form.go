package types

// 技能推荐配置参数
type PlusAgentSkillFeatureForm struct {
	Featured bool `json:"featured"`
	RecommendWeight int `json:"recommendWeight"`
}
