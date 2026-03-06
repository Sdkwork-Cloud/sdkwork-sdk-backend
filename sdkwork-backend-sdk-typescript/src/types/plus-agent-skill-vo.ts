/** 技能管理VO */
export interface PlusAgentSkillVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 技能ID */
  id?: number;
  /** 技能UUID */
  uuid?: string;
  /** 租户ID */
  tenantId?: number;
  /** 组织ID */
  organizationId?: number;
  /** 归属用户ID */
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
  /** 分类名称 */
  categoryName?: string;
  /** 分包ID */
  packageId?: number;
  /** 分包名称 */
  packageName?: string;
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
  /** 许可证 */
  licenseName?: string;
  /** 来源类型 */
  sourceType?: 'OFFICIAL' | 'COMMUNITY' | 'ENTERPRISE' | 'PRIVATE' | 'CUSTOM';
  /** 市场状态 */
  marketStatus?: 'DRAFT' | 'PUBLISHED' | 'OFFLINE' | 'DEPRECATED';
  /** 可见性 */
  visibility?: 'PUBLIC' | 'PRIVATE' | 'UNLISTED';
  /** 审核状态 */
  reviewStatus?: 'PENDING' | 'APPROVED' | 'REJECTED';
  /** 审核意见 */
  reviewComment?: string;
  /** 审核人用户ID */
  reviewedBy?: number;
  /** 审核时间 */
  reviewedAt?: string;
  /** 是否内置 */
  builtin?: boolean;
  /** 是否启用 */
  enabled?: boolean;
  /** 是否推荐 */
  featured?: boolean;
  /** 推荐权重 */
  recommendWeight?: number;
  /** 价格 */
  price?: number;
  /** 货币 */
  currency?: string;
  /** 安装次数 */
  installCount?: number;
  /** 评分均值 */
  ratingAvg?: number;
  /** 评分次数 */
  ratingCount?: number;
  /** 标签 */
  tags?: string[];
  /** 能力列表 */
  capabilities?: string[];
  /** 配置schema */
  configSchema?: Record<string, unknown>;
  /** 默认配置 */
  defaultConfig?: Record<string, unknown>;
  /** 最近发布时间 */
  latestPublishedAt?: string;
}
