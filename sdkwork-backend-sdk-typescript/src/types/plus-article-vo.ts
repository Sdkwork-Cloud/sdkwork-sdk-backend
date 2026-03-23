import type { AuthorInfo } from './author-info';
import type { ImageMediaResourceList } from './image-media-resource-list';

/** AIçææç« VOå¯¹è±¡ */
export interface PlusArticleVO {
  /** åå»ºæ¶é´ï¼å®ä½é¦æ¬¡æä¹åæ¶è®¾ç½® */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ï¼å®ä½ä¿®æ¹æ¶æ´æ° */
  updatedAt?: string;
  /** ä¸»é®IDï¼ç±æ°æ®åºèªå¨çæ */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** æç« æ é¢ */
  title?: string;
  /** æç« å¯æ é¢ */
  subtitle?: string;
  /** æç« æ­£æåå®¹ */
  content?: string;
  /** æç« åç±»ID */
  categoryId?: number;
  /** æç« å­æ°ç»è®¡ */
  wordCount?: number;
  /** é¢è®¡éè¯»æ¶é´ */
  readingTime?: number;
  /** æç« å°é¢å¾URL */
  coverImages?: ImageMediaResourceList;
  /** æç« ä½èä¿¡æ¯ */
  author?: AuthorInfo;
  /** æç« æ¥æº */
  source?: string;
  /** æç« ç¶æ */
  status?: 'DEFAULT' | 'DRAFT' | 'PUBLISHED' | 'ARCHIVED' | 'DELETED';
  /** æç« å³é®è¯ */
  keywords?: string[];
  /** æç« æè¦ */
  summary?: string;
}
