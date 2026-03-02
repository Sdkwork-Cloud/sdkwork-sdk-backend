import type { PlusTreeParentMetadata } from './plus-tree-parent-metadata';

/** Comment creation form with content details */
export interface PlusCommentsForm {
  /** 评论内容 */
  content: string;
  /** 内容类型 */
  contentType: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** 被评论内容ID */
  contentId: number;
  /** 评论状态 */
  status?: 'DEFAULT' | 'PUBLISHED' | 'PENDING' | 'DELETED';
  /**  (INT): 评分 (1-5星，可选)。 */
  rating?: number;
  /** 点赞数量 */
  likes?: number;
  /** 回复数量 */
  replyCount?: number;
  /** 是否置顶 */
  isTop?: boolean;
  /** 评论者IP地址 */
  ipAddress?: string;
  /** 设备信息 */
  deviceInfo?: string;
  /** 父节点ID */
  parentId?: number;
  /** 父节点UUID */
  parentUuid?: string;
  /** 用户ID(外键关联plus_user.id) */
  userId: number;
  parentMetadata?: PlusTreeParentMetadata;
}
