/** Skill batch review request */
export interface PlusAgentSkillBatchReviewForm {
  /** Skill IDs to review */
  skillIds: number[];
  /** Review comment */
  comment?: string;
}
