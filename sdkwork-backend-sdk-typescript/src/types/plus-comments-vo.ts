import type { AuthorInfo } from './author-info';

/** ç¨æ·è¯è®ºVOï¼æ¯ææ°é»ãæç« ãè§é¢ãå¾çãååãå¸å­ç­ä»»ä½åå®¹ç±»åçè¯è®º */
export interface PlusCommentsVO {
  /** åå»ºæ¶é´ï¼å®ä½é¦æ¬¡æä¹åæ¶è®¾ç½® */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ï¼å®ä½ä¿®æ¹æ¶æ´æ° */
  updatedAt?: string;
  /** ä¸»é®IDï¼ç±æ°æ®åºèªå¨çæ */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** ç¶èç¹ID */
  parentId?: number;
  /** ç¶èç¹UUID */
  parentUuid?: string;
  /** ç¨æ·ID(å¤é®å³èplus_user.id) */
  userId?: number;
  /** è¯è®ºåå®¹ */
  content: string;
  /** åå®¹ç±»å */
  contentType: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM' | 'JOB';
  /** è¢«è¯è®ºåå®¹ID */
  contentId: number;
  /** è¯è®ºç¶æ */
  status?: 'DEFAULT' | 'PUBLISHED' | 'PENDING' | 'DELETED';
  /** ç¹èµæ°é */
  likes?: number;
  /** åå¤æ°é */
  replyCount?: number;
  /** æ¯å¦ç½®é¡¶ */
  isTop?: boolean;
  /** è¯è®ºèIPå°å */
  ipAddress?: string;
  /** è®¾å¤ä¿¡æ¯ */
  deviceInfo?: string;
  /** ä½èä¿¡æ¯ */
  author?: AuthorInfo;
}
