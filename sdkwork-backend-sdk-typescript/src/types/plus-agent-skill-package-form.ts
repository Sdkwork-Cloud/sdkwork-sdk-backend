/** 技能分包创建/更新表单 */
export interface PlusAgentSkillPackageForm {
  /** 归属用户ID，不传默认当前用户 */
  userId?: number;
  /** 分包标识（machine key） */
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
  /** 是否启用 */
  enabled?: boolean;
  /** 是否推荐 */
  featured?: boolean;
  /** 排序权重 */
  sortWeight?: number;
  /** 标签 */
  tags?: string[];
}
