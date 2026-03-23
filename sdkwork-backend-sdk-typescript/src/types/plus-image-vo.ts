import type { AuthorInfo } from './author-info';
import type { ImageMediaResource } from './image-media-resource';

/** å¾çä¿¡æ¯VO */
export interface PlusImageVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** å¾çæ é¢ */
  title?: string;
  /** å¾çæè¿°ä¿¡æ¯ */
  description?: string;
  /** å¾çèµæºä¿¡æ¯ */
  resource?: ImageMediaResource;
  /** ä½èä¿¡æ¯ */
  author?: AuthorInfo;
  /** å¾çå­å¨URL */
  url?: string;
  /** å¾çæ¯ä¾ */
  aspectRatio?: string;
  /** å¾çå®½åº¦ï¼åç´ ï¼ */
  width?: number;
  /** å¾çé«åº¦ï¼åç´ ï¼ */
  height?: number;
  /** å¾çæä»¶å¤§å° */
  fileSize?: number;
  /** å¾çæ ¼å¼ */
  format?: string;
  /** å¾çç¶æ */
  status?: 'DEFAULT' | 'PROCESSING' | 'COMPLETED' | 'FAILED' | 'DELETED';
}
