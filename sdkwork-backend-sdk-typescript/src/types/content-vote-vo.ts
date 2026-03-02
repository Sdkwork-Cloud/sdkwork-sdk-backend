import type { ContentVoteMetadata } from './content-vote-metadata';

/** 内容投票数据传输对象 */
export interface ContentVoteVO {
  /** 创建时间 */
  createdAt?: string;
  /** 最后更新时间 */
  updatedAt?: string;
  /** 主键ID */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 版本号（乐观锁控制） */
  v?: number;
  /** 用户ID（关联plus_user.id） */
  userId?: number;
  /** 内容类型（如:商品、会员、新闻等） */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** 评分(like, dislike, neutral) */
  rating?: 'LIKE' | 'DISLIKE' | 'NEUTRAL';
  /** 关联内容ID（外键关联对应实体的ID） */
  contentId?: number;
  /** 元数据 */
  metadata?: ContentVoteMetadata;
}
