import type { ContentVoteMetadata } from './content-vote-metadata';

/** åå®¹æç¥¨æ°æ®ä¼ è¾å¯¹è±¡ */
export interface ContentVoteVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** çæ¬å·ï¼ä¹è§éæ§å¶ï¼ */
  v?: number;
  /** ç¨æ·IDï¼å³èplus_user.idï¼ */
  userId?: number;
  /** åå®¹ç±»åï¼å¦:ååãä¼åãæ°é»ç­ï¼ */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM' | 'JOB';
  /** è¯å(like, dislike, neutral) */
  rating?: 'LIKE' | 'DISLIKE' | 'NEUTRAL';
  /** å³èåå®¹IDï¼å¤é®å³èå¯¹åºå®ä½çIDï¼ */
  contentId?: number;
  /** åæ°æ® */
  metadata?: ContentVoteMetadata;
}
