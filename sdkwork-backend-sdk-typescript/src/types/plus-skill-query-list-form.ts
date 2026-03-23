/** Skill query form */
export interface PlusSkillQueryListForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** Keyword for name, skillKey, summary, description or provider */
  keyword?: string;
  /** Owner user id */
  userId?: number;
  /** Category id */
  categoryId?: number;
  /** Package id */
  packageId?: number;
  /** Skill market status */
  marketStatus?: 'DRAFT' | 'PUBLISHED' | 'OFFLINE' | 'DEPRECATED';
  /** Skill visibility */
  visibility?: 'PUBLIC' | 'PRIVATE' | 'UNLISTED';
  /** Skill source type */
  sourceType?: 'OFFICIAL' | 'COMMUNITY' | 'ENTERPRISE' | 'PRIVATE' | 'CUSTOM';
  /** Skill review status */
  reviewStatus?: 'PENDING' | 'APPROVED' | 'REJECTED';
  /** Whether the skill is builtin */
  builtin?: boolean;
  /** Whether the skill is enabled */
  enabled?: boolean;
  /** Whether the skill is featured */
  featured?: boolean;
}
