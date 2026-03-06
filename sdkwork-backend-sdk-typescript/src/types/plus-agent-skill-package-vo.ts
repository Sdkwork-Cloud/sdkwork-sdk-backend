/** 技能分包管理VO */
export interface PlusAgentSkillPackageVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 分包ID */
  id?: number;
  /** 分包UUID */
  uuid?: string;
  /** 租户ID */
  tenantId?: number;
  /** 组织ID */
  organizationId?: number;
  /** 归属用户ID */
  userId?: number;
  /** 分包标识 */
  packageKey?: string;
  /** 分包名称 */
  name?: string;
  /** 分包简介 */
  summary?: string;
  /** 分包描述 */
  description?: string;
  /** 分包图标 */
  icon?: string;
  /** 封面图 */
  coverImage?: string;
  /** 分类ID */
  categoryId?: number;
  /** 分类名称 */
  categoryName?: string;
  /** 标签 */
  tags?: string[];
  /** 是否启用 */
  enabled?: boolean;
  /** 是否推荐 */
  featured?: boolean;
  /** 排序权重 */
  sortWeight?: number;
  /** 关联技能数量 */
  skillCount?: number;
  /** 最近发布时间 */
  latestPublishedAt?: string;
}
