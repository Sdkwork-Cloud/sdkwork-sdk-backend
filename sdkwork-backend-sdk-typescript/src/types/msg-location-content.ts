import type { GeoPoint } from './geo-point';

/** IMä½ç½®æ¶æ¯åå®¹ç±» */
export interface MsgLocationContent {
  /** æ¶æ¯åå®¹ */
  content?: string;
  /** å°çä½ç½®åæ  */
  location?: GeoPoint;
  /** ä½ç½®çå°åä¿¡æ¯ */
  address?: string;
  /** ä½ç½®æå°ç¹åç§° */
  name?: string;
  /** ä½ç½®ç²¾åº¦åå¾(ç±³) */
  radius?: number;
}
