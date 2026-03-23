import type { ShareContents } from './share-contents';
import type { TagsContent } from './tags-content';

/** åäº«VO */
export interface PlusShareVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** åäº«ID */
  id?: number;
  /** åäº«UUID */
  uuid?: string;
  /** åäº«æ é¢ */
  title?: string;
  /** åäº«æè¿° */
  description?: string;
  /** åäº«ç±»å */
  type?: 'LINK' | 'PRODUCT' | 'FILE' | 'DOCUMENT' | 'IMAGE' | 'VIDEO' | 'AUDIO' | 'ARTICLE' | 'FAVORITE' | 'MIXED';
  /** åäº«åå®¹ */
  contents?: ShareContents;
  /** åå®¹ç±»å */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM' | 'JOB';
  /** åäº«ç¶æ */
  status?: 'ACTIVE' | 'DISABLED' | 'EXPIRED' | 'DELETED';
  /** åäº«é¾æ¥ */
  shareUrl?: string;
  /** å³èåå®¹IDåè¡¨ */
  contentIds?: string[];
  /** åäº«å¯ç  */
  password?: string;
  /** è¿ææ¶é´ */
  expireAt?: string;
  /** ç¹å»æ¬¡æ° */
  clickCount?: number;
  /** åäº«æ ç­¾ */
  tags?: TagsContent;
  /** åäº«ç  */
  shareCode?: string;
}
