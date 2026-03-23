/** Skill package view object */
export interface PlusSkillBundleVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** Package id */
  id?: number;
  /** Package uuid */
  uuid?: string;
  /** Tenant id */
  tenantId?: number;
  /** Organization id */
  organizationId?: number;
  /** Owner user id */
  userId?: number;
  /** Unique package key */
  packageKey?: string;
  /** Package name */
  name?: string;
  /** Package summary */
  summary?: string;
  /** Package description */
  description?: string;
  /** Package icon */
  icon?: string;
  /** Package cover image */
  coverImage?: string;
  /** Category id */
  categoryId?: number;
  /** Category name */
  categoryName?: string;
  /** Package tags */
  tags?: string[];
  /** Whether the package is enabled */
  enabled?: boolean;
  /** Whether the package is featured */
  featured?: boolean;
  /** Sort weight */
  sortWeight?: number;
  /** Bound skill count */
  skillCount?: number;
  /** Latest publish time */
  latestPublishedAt?: string;
}
