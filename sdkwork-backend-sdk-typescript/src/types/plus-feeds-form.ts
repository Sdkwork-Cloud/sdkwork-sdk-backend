import type { ImageMediaResourceList } from './image-media-resource-list';
import type { TagsContent } from './tags-content';

/** Feeds creation form */
export interface PlusFeedsForm {
  /** Feeds标题 */
  title: string;
  /** Feeds内容摘要 */
  summary?: string;
  /** 关联内容类型 */
  contentType: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** 关联内容ID */
  contentId: number;
  /** 封面图片列表 */
  coverImages?: ImageMediaResourceList;
  /** 内容来源 */
  source?: string;
  /** 发布时间 */
  publishTime?: string;
  /** Feeds标签 */
  tags?: TagsContent;
  /** Feeds状态 */
  status: 'DEFAULT' | 'DRAFT' | 'PUBLISHED' | 'DELETED';
  /** 浏览次数 */
  viewCount?: number;
  /** 点赞次数 */
  likeCount?: number;
  /** 评论次数 */
  commentCount?: number;
}
