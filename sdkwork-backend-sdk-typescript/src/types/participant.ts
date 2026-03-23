import type { ImageMediaResource } from './image-media-resource';

/** æ¶æ¯åä¸èå®ä½ç±» */
export interface Participant {
  /** åä¸èID */
  id?: number;
  /** åä¸èUUID */
  uuid?: string;
  /** å¼æ¾å¹³å°OpenID */
  openId?: string;
  /** å¼æ¾å¹³å°UnionID */
  unionId?: string;
  /** åä¸èåç§° */
  name?: string;
  /** åä¸èå¤´å */
  face?: ImageMediaResource;
  /** è®¾å¤ID */
  deviceId?: number;
  /** è®¾å¤UUID */
  deviceUuid?: string;
  device?: boolean;
}
