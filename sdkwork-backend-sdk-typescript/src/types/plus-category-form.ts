/** Category creation form */
export interface PlusCategoryForm {
  /** Category name */
  name: string;
  /** Category description */
  description?: string;
  /** Category type */
  type: 'DEFAULT' | 'AGENT' | 'TOOL' | 'PROMPT' | 'FEEDS' | 'PRODUCT' | 'COURSE' | 'NEWS' | 'BOOK' | 'VIDEO' | 'AUDIO' | 'MUSIC' | 'SAAS' | 'PPT' | 'EVENTS' | 'NOTARY' | 'SHOP' | 'VOICE_SPEAK' | 'SOUND_EFFECT' | 'SKILLS' | 'SKILLS_COLLECTION' | 'PLUGIN' | 'MCP' | 'KNOWLEDGE_BASE' | 'RECRUIT' | 'CLAW' | 'OTHER';
  /** Category icon */
  icon?: string;
  /** Sort weight */
  sortWeight?: number;
  /** Parent category ID */
  parentId?: number;
  /** Category path */
  path?: string[];
  /** Visibility flag */
  visible: number;
  /** Category status */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DELETED';
}
