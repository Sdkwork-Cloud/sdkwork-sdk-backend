/** 技能推荐配置参数 */
export interface PlusAgentSkillFeatureForm {
  /** 是否推荐 */
  featured?: boolean;
  /** 推荐权重，>=0 */
  recommendWeight?: number;
}
