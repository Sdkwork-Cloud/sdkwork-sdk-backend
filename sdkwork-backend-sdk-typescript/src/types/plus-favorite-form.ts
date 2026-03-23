import type { ImageMediaResource } from './image-media-resource';

/** Favorite creation form */
export interface PlusFavoriteForm {
  /** Content type */
  contentType: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM' | 'JOB';
  /** Content ID */
  contentId: number;
  /** Remark */
  remark?: string;
  /** Sort weight */
  sortWeight?: number;
  /** Favorite title */
  title?: string;
  /** Favorite image */
  image?: ImageMediaResource;
  /** Whether the favorite is private */
  isPrivate?: boolean;
  /** Favorite status */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
}
