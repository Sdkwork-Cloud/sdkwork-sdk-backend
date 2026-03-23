/** Skill package query form */
export interface PlusSkillBundleQueryListForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** Keyword for name, packageKey, summary or description */
  keyword?: string;
  /** Owner user id */
  userId?: number;
  /** Category id */
  categoryId?: number;
  /** Whether the package is enabled */
  enabled?: boolean;
  /** Whether the package is featured */
  featured?: boolean;
}
