/** 技能创建/更新表单 */
export interface PlusAgentSkillForm {
  /** 技能归属用户ID，不传默认当前用户 */
  userId?: number;
  /** 技能唯一标识 */
  skillKey?: string;
  /** 技能名称 */
  name?: string;
  /** 技能简介 */
  summary?: string;
  /** 技能描述 */
  description?: string;
  /** 技能图标 */
  icon?: string;
  /** 技能封面图 */
  coverImage?: string;
  /** 分类ID */
  categoryId?: number;
  /** 分包ID */
  packageId?: number;
  /** 提供商 */
  provider?: string;
  /** 版本 */
  version?: string;
  /** 运行时 */
  runtime?: string;
  /** 入口 */
  entrypoint?: string;
  /** manifest地址 */
  manifestUrl?: string;
  /** 代码仓库地址 */
  repositoryUrl?: string;
  /** 主页地址 */
  homepageUrl?: string;
  /** 文档地址 */
  documentationUrl?: string;
  /** 许可证名称 */
  licenseName?: string;
  /** 来源类型 */
  sourceType?: 'OFFICIAL' | 'COMMUNITY' | 'ENTERPRISE' | 'PRIVATE' | 'CUSTOM';
  /** 可见性 */
  visibility?: 'PUBLIC' | 'PRIVATE' | 'UNLISTED';
  /** 是否启用 */
  enabled?: boolean;
  /** 价格 */
  price?: number;
  /** 货币 */
  currency?: string;
  /** 标签 */
  tags?: string[];
  /** 能力列表 */
  capabilities?: string[];
  /** 配置Schema */
  configSchema?: Record<string, unknown>;
  /** 默认配置 */
  defaultConfig?: Record<string, unknown>;
}
