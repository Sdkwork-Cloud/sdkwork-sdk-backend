import type { AuthorInfo } from './author-info';
import type { VideoMediaResource } from './video-media-resource';

/** è§é¢ä¿¡æ¯VO */
export interface PlusVideoVO {
  /** åå»ºæ¶é´ï¼å®ä½é¦æ¬¡æä¹åæ¶è®¾ç½® */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ï¼å®ä½ä¿®æ¹æ¶æ´æ° */
  updatedAt?: string;
  /** ä¸»é®IDï¼ç±æ°æ®åºèªå¨çæ */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** çæ¬å·ï¼ç¨äºä¹è§éæ§å¶ */
  version?: number;
  /** è§é¢æ é¢ */
  title?: string;
  /** è§é¢æè¿°ä¿¡æ¯ */
  description?: string;
  /** è§é¢èµæºä¿¡æ¯ */
  resource?: VideoMediaResource;
  /** ä½èä¿¡æ¯ */
  author?: AuthorInfo;
  /** è§é¢å­å¨URL */
  contentUrl?: string;
  /** è§é¢æ¯ä¾ */
  aspectRatio?: string;
  /** è§é¢æ¶é¿ï¼ç§ï¼ */
  duration?: number;
  /** è§é¢åè¾¨ç */
  resolution?: string;
  /** å¾çå®½åº¦ï¼åç´ ï¼ */
  width?: number;
  /** å¾çé«åº¦ï¼åç´ ï¼ */
  height?: number;
  /** è§é¢æä»¶å¤§å° */
  fileSize?: number;
  /** è§é¢æ ¼å¼ */
  format?: string;
  /** è§é¢ç¼©ç¥å¾URL */
  thumbnailUrl?: string;
  /** è§é¢ç¶æ */
  status?: 'DEFAULT' | 'PROCESSING' | 'COMPLETED' | 'FAILED' | 'DELETED';
}
