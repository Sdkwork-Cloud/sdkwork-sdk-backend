import type { ImageMediaResource } from './image-media-resource';

/** Favorite VO */
export interface PlusFavoriteVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** ID */
  id?: number;
  /** UUID */
  uuid?: string;
  /** Content type */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** Content ID */
  contentId?: number;
  /** Folder ID */
  folderId?: number;
  /** Remark */
  remark?: string;
  /** Tags */
  tags?: string;
  /** Sort weight */
  sortWeight?: number;
  /** Title */
  title?: string;
  /** Image */
  image?: ImageMediaResource;
  /** Is private */
  isPrivate?: boolean;
  /** Status */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** View count */
  viewCount?: number;
  /** Last viewed at */
  lastViewedAt?: string;
}
