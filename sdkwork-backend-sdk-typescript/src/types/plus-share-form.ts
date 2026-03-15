import type { ShareContents } from './share-contents';
import type { TagsContent } from './tags-content';

/** 分享创建表单 */
export interface PlusShareForm {
  /** Share title */
  title?: string;
  /** Share description */
  description?: string;
  /** Share type */
  type: 'LINK' | 'PRODUCT' | 'FILE' | 'DOCUMENT' | 'IMAGE' | 'VIDEO' | 'AUDIO' | 'ARTICLE' | 'FAVORITE' | 'MIXED';
  /** Share contents */
  contents?: ShareContents;
  /** Content type */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** Share status */
  status?: 'ACTIVE' | 'DISABLED' | 'EXPIRED' | 'DELETED';
  /** Share URL */
  shareUrl?: string;
  /** Content ID list */
  contentIds?: string[];
  /** Access password */
  password?: string;
  /** Expiration time */
  expireAt?: string;
  /** Click count */
  clickCount?: number;
  /** Tags */
  tags?: TagsContent;
  /** Share code */
  shareCode?: string;
}
