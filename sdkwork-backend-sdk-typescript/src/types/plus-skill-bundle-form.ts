/** Skill package create or update form */
export interface PlusSkillBundleForm {
  /** Owner user id */
  userId?: number;
  /** Unique skill package key */
  packageKey?: string;
  /** Skill package name */
  name?: string;
  /** Skill package summary */
  summary?: string;
  /** Skill package description */
  description?: string;
  /** Skill package icon */
  icon?: string;
  /** Skill package cover image */
  coverImage?: string;
  /** Category id */
  categoryId?: number;
  /** Whether the package is enabled */
  enabled?: boolean;
  /** Whether the package is featured */
  featured?: boolean;
  /** Sort weight */
  sortWeight?: number;
  /** Skill package tags */
  tags?: string[];
}
