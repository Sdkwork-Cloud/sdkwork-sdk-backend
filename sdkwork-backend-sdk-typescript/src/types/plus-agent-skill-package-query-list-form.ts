/** 技能分包查询参数 */
export interface PlusAgentSkillPackageQueryListForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** 关键词（匹配 name/packageKey/summary/description） */
  keyword?: string;
  /** 归属用户ID */
  userId?: number;
  /** 分类ID */
  categoryId?: number;
  /** 是否启用 */
  enabled?: boolean;
  /** 是否推荐 */
  featured?: boolean;
}
