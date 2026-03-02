import type { ContentVoteMetadata } from './content-vote-metadata';

/** Vote creation form */
export interface ContentVoteForm {
  /** 内容类型(如:商品、会员、新闻等) */
  contentType: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** 评分(like/ dislike/ neutral) */
  rating: string;
  /** 关联内容ID(外键关联对应实体的ID) */
  contentId: number;
  /** 元数据(Json格式) */
  metadata?: ContentVoteMetadata;
}
