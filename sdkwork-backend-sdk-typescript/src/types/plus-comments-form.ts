import type { PlusTreeParentMetadata } from './plus-tree-parent-metadata';

/** Comment creation form with content details */
export interface PlusCommentsForm {
  /** Comment content */
  content: string;
  /** Content type */
  contentType: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** Content ID */
  contentId: number;
  /** Comment status */
  status?: 'DEFAULT' | 'PUBLISHED' | 'PENDING' | 'DELETED';
  /** Like count */
  likes?: number;
  /** Reply count */
  replyCount?: number;
  /** Whether pinned */
  isTop?: boolean;
  /** Client IP address */
  ipAddress?: string;
  /** Client device information */
  deviceInfo?: string;
  /** Parent comment ID */
  parentId?: number;
  /** Parent comment UUID */
  parentUuid?: string;
  /** User ID */
  userId: number;
  parentMetadata?: PlusTreeParentMetadata;
}
