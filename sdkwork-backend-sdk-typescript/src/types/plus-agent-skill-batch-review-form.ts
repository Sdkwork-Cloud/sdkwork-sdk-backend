/** 技能批量审核参数 */
export interface PlusAgentSkillBatchReviewForm {
  /** 技能ID列表 */
  skillIds: number[];
  /** 审核备注/驳回原因 */
  comment?: string;
}
