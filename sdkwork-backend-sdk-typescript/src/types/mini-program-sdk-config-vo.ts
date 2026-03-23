/** å¾®ä¿¡å°ç¨åºSDKéç½® */
export interface MiniProgramSdkConfigVO {
  /** å°ç¨åºçAppID */
  appId?: string;
  /** çæç­¾åçæ¶é´æ³ */
  timestamp?: number;
  /** çæç­¾åçéæºä¸² */
  nonceStr?: string;
  /** ç­¾å */
  signature?: string;
  /** éè¦ä½¿ç¨çJSæ¥å£åè¡¨ */
  jsApiList?: string[];
}
