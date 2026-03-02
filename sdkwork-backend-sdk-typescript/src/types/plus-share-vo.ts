import type { ShareContents } from './share-contents';
import type { TagsContent } from './tags-content';

/** 分享VO */
export interface PlusShareVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 分享ID */
  id?: number;
  /** 分享UUID */
  uuid?: string;
  /** 分享标题 */
  title?: string;
  /** 分享描述 */
  description?: string;
  /** 分享类型 */
  type?: 'LINK' | 'PRODUCT' | 'FILE' | 'DOCUMENT' | 'IMAGE' | 'VIDEO' | 'AUDIO' | 'ARTICLE' | 'FAVORITE' | 'MIXED';
  /** 分享内容 */
  contents?: ShareContents;
  /** 内容类型 */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** 分享状态 */
  status?: 'ACTIVE' | 'DISABLED' | 'EXPIRED' | 'DELETED';
  /** 分享链接 */
  shareUrl?: string;
  /** 关联内容ID列表 */
  contentIds?: string[];
  /** 分享密码 */
  password?: string;
  /** 过期时间 */
  expireAt?: string;
  /** 点击次数 */
  clickCount?: number;
  /** 分享标签 */
  tags?: TagsContent;
  /** 分享码 */
  shareCode?: string;
}
