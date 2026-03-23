import type { DetailContent } from './detail-content';

/** Detail Value Object (Generic detailed content for various entities) */
export interface PlusDetailVO {
  /** åå»ºæ¶é´ï¼å®ä½é¦æ¬¡æä¹åæ¶è®¾ç½® */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ï¼å®ä½ä¿®æ¹æ¶æ´æ° */
  updatedAt?: string;
  /** ä¸»é®IDï¼ç±æ°æ®åºèªå¨çæ */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** åå®¹ç±»å(å¦:ååãä¼åãæ°é»ç­) */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM' | 'JOB';
  /** å³èåå®¹ID(å¤é®å³èå¯¹åºå®ä½çID) */
  contentId?: number;
  /** è¯¦ç»åå®¹(HTMLæå¯ææ¬) */
  content?: DetailContent;
  /** å³èäº§åID(ä»åå®¹ç±»åä¸ºååæ¶ææ) */
  productId?: number;
  /** å³èSkuID(ä»åå®¹ç±»åä¸ºååæ¶ææ) */
  skuId?: number;
}
