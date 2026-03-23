import type { ImageMediaResourceList } from './image-media-resource-list';
import type { TagsContent } from './tags-content';

/** Feeds creation form */
export interface PlusFeedsForm {
  /** Feeds title */
  title: string;
  /** Feeds summary */
  summary?: string;
  /** Category ID */
  categoryId: number;
  /** Content type */
  contentType: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM' | 'JOB';
  /** Content ID */
  contentId: number;
  /** Cover images */
  coverImages?: ImageMediaResourceList;
  /** Source */
  source?: string;
  /** Publish time */
  publishTime?: string;
  /** Tags */
  tags?: TagsContent;
  /** Feeds status */
  status?: 'DEFAULT' | 'DRAFT' | 'PUBLISHED' | 'DELETED';
}
