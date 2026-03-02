import type { AssetMediaResourceList } from './asset-media-resource-list';
import type { AuthorInfo } from './author-info';
import type { ImageMediaResourceList } from './image-media-resource-list';
import type { TagsContent } from './tags-content';

/** Feeds流VO对象，支持通用内容展示，包括新闻资讯、博客、视频、图片、音频等多种类型 */
export interface PlusFeedsVO {
  /** 创建时间，实体首次持久化时设置 */
  createdAt?: string;
  /** 最后更新时间，实体修改时更新 */
  updatedAt?: string;
  /** 主键ID，由数据库自动生成 */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 用户ID(外键关联plus_user.id) */
  userId?: number;
  /** Feeds标题 */
  title?: string;
  /** Feeds内容摘要 */
  summary?: string;
  /** 关联内容类型 */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** 关联内容ID */
  contentId?: number;
  /** 封面图片URL列表 */
  coverImages?: ImageMediaResourceList;
  /** resource list */
  resourceList?: AssetMediaResourceList;
  /** 作者信息 */
  author?: AuthorInfo;
  /** 内容来源 */
  source?: string;
  /** 发布时间 */
  publishTime?: string;
  /** Feeds标签 */
  tags?: TagsContent;
  /** Feeds状态 */
  status?: 'DEFAULT' | 'DRAFT' | 'PUBLISHED' | 'DELETED';
  /** 浏览次数 */
  viewCount?: number;
  /** 点赞次数 */
  likeCount?: number;
  /** 评论次数 */
  commentCount?: number;
}
