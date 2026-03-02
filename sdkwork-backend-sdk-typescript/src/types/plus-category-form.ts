/** Category creation form */
export interface PlusCategoryForm {
  /** 分类名称 */
  name: string;
  /** 分类描述 */
  description?: string;
  /** 分类类型(AGENT:1, TOOL:2, PROMPT:3, OTHER:4) */
  type: 'DEFAULT' | 'AGENT' | 'TOOL' | 'PROMPT' | 'FEEDS' | 'PRODUCT' | 'COURSE' | 'NEWS' | 'BOOK' | 'VIDEO' | 'AUDIO' | 'MUSIC' | 'SAAS' | 'PPT' | 'EVENTS' | 'NOTARY' | 'SHOP' | 'VOICE_SPEAK' | 'SOUND_EFFECT' | 'SKILLS' | 'SKILLS_COLLECTION' | 'PLUGIN' | 'MCP' | 'KNOWLEDGE_BASE' | 'OTHER';
  /** 分类图标URL/路径 */
  icon?: string;
  /** 排序权重(值越大排序越靠前) */
  sortWeight?: number;
  /** 父分类ID */
  parentId?: number;
  /** 分类路径(格式:1,2,3表示从根分类到当前分类的ID路径) */
  path?: string[];
  /** 可见性标志(0:隐藏,1:可见) */
  visible: number;
  /** 分类状态(1:启用,2:禁用,3:删除) */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DELETED';
}
