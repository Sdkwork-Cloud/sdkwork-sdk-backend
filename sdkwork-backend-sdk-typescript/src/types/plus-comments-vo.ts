import type { AuthorInfo } from './author-info';

/** 用户评论VO，支持新闻、文章、视频、图片、商品、帖子等任何内容类型的评论 */
export interface PlusCommentsVO {
  /** 创建时间，实体首次持久化时设置 */
  createdAt?: string;
  /** 最后更新时间，实体修改时更新 */
  updatedAt?: string;
  /** 主键ID，由数据库自动生成 */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 父节点ID */
  parentId?: number;
  /** 父节点UUID */
  parentUuid?: string;
  /** 用户ID(外键关联plus_user.id) */
  userId?: number;
  /** 评论内容 */
  content: string;
  /** 内容类型 */
  contentType: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM' | 'JOB' | 'SKILL';
  /** 被评论内容ID */
  contentId: number;
  /** 评论状态 */
  status?: 'DEFAULT' | 'PUBLISHED' | 'PENDING' | 'DELETED';
  /** 点赞数量 */
  likes?: number;
  /** 回复数量 */
  replyCount?: number;
  /** 是否置顶 */
  isTop?: boolean;
  /** 评论者IP地址 */
  ipAddress?: string;
  /** 设备信息 */
  deviceInfo?: string;
  /** 作者信息 */
  author?: AuthorInfo;
}
