/** è®¿é®åå²VO */
export interface PlusVisitHistoryVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦ */
  uuid?: string;
  /** ç¨æ·ID */
  userId?: number;
  /** åå®¹ç±»å */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM' | 'JOB';
  /** å³èçåå®¹ID */
  contentId?: number;
  /** è®¿é®æ¬¡æ° */
  visitCount?: number;
  /** æåè®¿é®æ¶é´ */
  lastVisitedAt?: string;
  /** è®¿é®æ¶é¿ï¼ç§ï¼ */
  duration?: number;
  /** è®¿é®æ¥æº */
  source?: string;
}
