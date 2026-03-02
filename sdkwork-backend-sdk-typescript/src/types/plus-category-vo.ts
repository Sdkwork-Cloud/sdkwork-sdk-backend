import type { PlusTreeParentMetadata } from './plus-tree-parent-metadata';
import type { TagsContent } from './tags-content';

/** AI分类VO，用于管理不同内容类型(如Agent、Tool、Prompt等)的分类 */
export interface PlusCategoryVO {
  parentUuid?: string;
  parentMetadata?: PlusTreeParentMetadata;
  /** 主键ID，由数据库自动生成 */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 创建时间，实体首次持久化时设置 */
  createdAt?: string;
  /** 最后更新时间，实体修改时更新 */
  updatedAt?: string;
  /** 分类名称 */
  name?: string;
  /** 分类描述 */
  description?: string;
  /** 分类类型(1:Agent分类,2:Tool分类,3:Prompt分类,4:其他分类) */
  type?: 'DEFAULT' | 'AGENT' | 'TOOL' | 'PROMPT' | 'FEEDS' | 'PRODUCT' | 'COURSE' | 'NEWS' | 'BOOK' | 'VIDEO' | 'AUDIO' | 'MUSIC' | 'SAAS' | 'PPT' | 'EVENTS' | 'NOTARY' | 'SHOP' | 'VOICE_SPEAK' | 'SOUND_EFFECT' | 'SKILLS' | 'SKILLS_COLLECTION' | 'PLUGIN' | 'MCP' | 'KNOWLEDGE_BASE' | 'OTHER';
  /** 分类图标URL/路径 */
  icon?: string;
  /** 排序权重(值越大排序越靠前) */
  sortWeight?: number;
  /** 父分类ID */
  parentId?: number;
  /** 分类路径(格式:1,2,3表示从根分类到当前分类的ID路径) */
  path?: string[];
  /** 可见性标志(0:隐藏,1:可见) */
  visible?: number;
  /** 分类状态(1:启用,2:禁用,3:删除) */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DELETED';
  /** 子分类列表 */
  children?: PlusCategoryVO[];
  /** 标签 */
  tags?: TagsContent;
  /** 分类属性ID列表 */
  attributeIds?: number[];
}
