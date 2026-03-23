import type { PPTElementLink } from './pptelement-link';

/** åç´ éç¨å±æ§ */
export interface PPTBaseElement {
  /** åç´ ID */
  id: string;
  /** åç´ æ°´å¹³æ¹åä½ç½®ï¼è·ç¦»ç»å¸å·¦ä¾§ï¼ */
  left: number;
  /** åç´ åç´æ¹åä½ç½®ï¼è·ç¦»ç»å¸é¡¶é¨ï¼ */
  top: number;
  /** éå®åç´  */
  lock?: boolean;
  /** ç»åIDï¼æ¥æç¸åç»åIDçåç´ å³ä¸ºåä¸ç»ååç´ æåï¼ */
  groupId?: string;
  /** åç´ å®½åº¦ */
  width: number;
  /** åç´ é«åº¦ */
  height: number;
  /** æè½¬è§åº¦ */
  rotate: number;
  /** è¶é¾æ¥ */
  link?: PPTElementLink;
  /** åç´ å */
  name?: string;
}
