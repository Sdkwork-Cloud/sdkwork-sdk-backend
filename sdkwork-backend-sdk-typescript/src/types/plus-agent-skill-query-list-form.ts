/** 技能分页查询参数 */
export interface PlusAgentSkillQueryListForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** 关键词（匹配 name/skillKey/summary/description/provider） */
  keyword?: string;
  /** 归属用户ID */
  userId?: number;
  /** 分类ID */
  categoryId?: number;
  /** 分包ID */
  packageId?: number;
  /** 市场状态 */
  marketStatus?: 'DRAFT' | 'PUBLISHED' | 'OFFLINE' | 'DEPRECATED';
  /** 可见性 */
  visibility?: 'PUBLIC' | 'PRIVATE' | 'UNLISTED';
  /** 来源类型 */
  sourceType?: 'OFFICIAL' | 'COMMUNITY' | 'ENTERPRISE' | 'PRIVATE' | 'CUSTOM';
  /** 审核状态 */
  reviewStatus?: 'PENDING' | 'APPROVED' | 'REJECTED';
  /** 是否内置 */
  builtin?: boolean;
  /** 是否启用 */
  enabled?: boolean;
  /** 是否推荐 */
  featured?: boolean;
}
