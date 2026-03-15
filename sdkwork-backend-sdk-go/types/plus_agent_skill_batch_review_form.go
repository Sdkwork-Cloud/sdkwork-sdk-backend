package types

// Skill batch review request
type PlusAgentSkillBatchReviewForm struct {
	SkillIds []int `json:"skillIds"`
	Comment string `json:"comment"`
}
