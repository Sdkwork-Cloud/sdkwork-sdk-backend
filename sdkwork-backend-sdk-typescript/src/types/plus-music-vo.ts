import type { AssetMediaResourceList } from './asset-media-resource-list';
import type { AuthorInfo } from './author-info';
import type { ImageMediaResourceList } from './image-media-resource-list';
import type { MusicMediaResource } from './music-media-resource';

/** é³ä¹ä¿¡æ¯VO */
export interface PlusMusicVO {
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
  /** é³ä¹æ é¢ */
  title?: string;
  /** é³ä¹å°é¢å¾çåè¡¨ */
  coverImages?: ImageMediaResourceList;
  /** é³ä¹æè¿°ä¿¡æ¯ */
  description?: string;
  /** èµæºä¿¡æ¯ */
  resource?: MusicMediaResource;
  /** ä½èä¿¡æ¯ */
  author?: AuthorInfo;
  /** é³ä¹å­å¨URL */
  contentUrl?: string;
  /** é³ä¹èµæºåè¡¨ */
  resourceList?: AssetMediaResourceList;
  /** é³ä¹æ ¼å¼ */
  format?: string;
  /** é³ä¹æ¶é¿ï¼ç§ï¼ */
  duration?: number;
  /** é³ä¹æä»¶å¤§å° */
  fileSize?: number;
  /** é³ä¹ç¼©ç¥å¾URL */
  thumbnailUrl?: string;
  /** èºæ¯å®¶åç§° */
  artist?: string;
  /** é³ä¹æµæ´¾ */
  genre?: string;
  /** é³é¢æ¯ç¹ç */
  bitrate?: number;
  /** é³ä¹ç¶æ */
  status?: 'DEFAULT' | 'PROCESSING' | 'COMPLETED' | 'FAILED' | 'DELETED';
}
