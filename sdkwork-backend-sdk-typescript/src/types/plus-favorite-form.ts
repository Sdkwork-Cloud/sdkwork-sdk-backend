import type { ImageMediaResource } from './image-media-resource';

/** Favorite creation form */
export interface PlusFavoriteForm {
  /** 内容类型 */
  contentType: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** 关联的内容ID */
  contentId: number;
  /** 收藏夹名称 */
  folderName?: string;
  /** 收藏备注 */
  remark?: string;
  /** 排序权重 */
  sortWeight?: number;
  /** 收藏内容标题 */
  title?: string;
  /** 封面图片 */
  image?: ImageMediaResource;
  /** 是否私密收藏 */
  isPrivate?: boolean;
  /** 收藏状态 */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
}
