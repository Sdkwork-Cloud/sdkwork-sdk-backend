package types

// 技能批量审核参数
type PlusAgentSkillBatchReviewForm struct {
	SkillIds []int `json:"skillIds"`
	Comment string `json:"comment"`
}
