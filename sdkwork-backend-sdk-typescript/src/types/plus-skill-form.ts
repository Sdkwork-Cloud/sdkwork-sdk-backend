/** Skill create or update form */
export interface PlusSkillForm {
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
  /** Package id */
  packageId?: number;
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
  /** Skill visibility */
  visibility?: 'PUBLIC' | 'PRIVATE' | 'UNLISTED';
  /** Whether the skill is enabled */
  enabled?: boolean;
  /** Skill price */
  price?: number;
  /** Price currency */
  currency?: string;
  /** Skill tags */
  tags?: string[];
  /** Skill capabilities */
  capabilities?: string[];
  /** Configuration schema */
  configSchema?: Record<string, unknown>;
  /** Default configuration */
  defaultConfig?: Record<string, unknown>;
}
