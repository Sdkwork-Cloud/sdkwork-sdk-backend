/** Skill view object */
export interface PlusSkillVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** Skill id */
  id?: number;
  /** Skill uuid */
  uuid?: string;
  /** Tenant id */
  tenantId?: number;
  /** Organization id */
  organizationId?: number;
  /** Owner user id */
  userId?: number;
  /** Unique skill key */
  skillKey?: string;
  /** Skill name */
  name?: string;
  /** Skill summary */
  summary?: string;
  /** Skill description */
  description?: string;
  /** Skill icon */
  icon?: string;
  /** Skill cover image */
  coverImage?: string;
  /** Category id */
  categoryId?: number;
  /** Category name */
  categoryName?: string;
  /** Package id */
  packageId?: number;
  /** Package name */
  packageName?: string;
  /** Skill provider */
  provider?: string;
  /** Skill version */
  version?: string;
  /** Runtime type */
  runtime?: string;
  /** Entrypoint */
  entrypoint?: string;
  /** Manifest url */
  manifestUrl?: string;
  /** Repository url */
  repositoryUrl?: string;
  /** Homepage url */
  homepageUrl?: string;
  /** Documentation url */
  documentationUrl?: string;
  /** License name */
  licenseName?: string;
  /** Skill source type */
  sourceType?: 'OFFICIAL' | 'COMMUNITY' | 'ENTERPRISE' | 'PRIVATE' | 'CUSTOM';
  /** Skill market status */
  marketStatus?: 'DRAFT' | 'PUBLISHED' | 'OFFLINE' | 'DEPRECATED';
  /** Skill visibility */
  visibility?: 'PUBLIC' | 'PRIVATE' | 'UNLISTED';
  /** Skill review status */
  reviewStatus?: 'PENDING' | 'APPROVED' | 'REJECTED';
  /** Review comment */
  reviewComment?: string;
  /** Reviewer user id */
  reviewedBy?: number;
  /** Review time */
  reviewedAt?: string;
  /** Whether the skill is builtin */
  builtin?: boolean;
  /** Whether the skill is enabled */
  enabled?: boolean;
  /** Whether the skill is featured */
  featured?: boolean;
  /** Recommend weight */
  recommendWeight?: number;
  /** Skill price */
  price?: number;
  /** Price currency */
  currency?: string;
  /** Install count */
  installCount?: number;
  /** Average rating */
  ratingAvg?: number;
  /** Rating count */
  ratingCount?: number;
  /** Skill tags */
  tags?: string[];
  /** Skill capabilities */
  capabilities?: string[];
  /** Configuration schema */
  configSchema?: Record<string, unknown>;
  /** Default configuration */
  defaultConfig?: Record<string, unknown>;
  /** Latest publish time */
  latestPublishedAt?: string;
}
