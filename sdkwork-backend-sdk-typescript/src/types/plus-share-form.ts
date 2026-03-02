import type { ShareContents } from './share-contents';
import type { TagsContent } from './tags-content';

/** 分享创建表单 */
export interface PlusShareForm {
  /** 分享标题 */
  title?: string;
  /** 分享描述 */
  description?: string;
  /** 分享类型（链接、商品、文件等） */
  type: 'LINK' | 'PRODUCT' | 'FILE' | 'DOCUMENT' | 'IMAGE' | 'VIDEO' | 'AUDIO' | 'ARTICLE' | 'FAVORITE' | 'MIXED';
  /** 分享内容 */
  contents?: ShareContents;
  /** 内容类型 */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** 分享状态（有效、无效、已删除等） */
  status: 'ACTIVE' | 'DISABLED' | 'EXPIRED' | 'DELETED';
  /** 分享链接（当type为LINK时使用） */
  shareUrl?: string;
  /** 关联内容ID列表（JSON格式存储，当分享多个商品或文件时使用） */
  contentIds?: string[];
  /** 分享密码（可选） */
  password?: string;
  /** 过期时间 */
  expireAt?: string;
  /** 点击次数 */
  clickCount?: number;
  /** 分享标签 */
  tags?: TagsContent;
  /** 分享码（用于生成短链接，唯一） */
  shareCode?: string;
}
