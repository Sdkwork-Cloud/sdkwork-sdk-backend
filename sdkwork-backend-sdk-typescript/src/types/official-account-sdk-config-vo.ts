/** å¾®ä¿¡å¬ä¼å·JS-SDKéç½® */
export interface OfficialAccountSdkConfigVO {
  /** å¼å¯è°è¯æ¨¡å¼ */
  debug?: boolean;
  /** æå¡å·çå¯ä¸æ è¯ */
  appId?: string;
  /** çæç­¾åçæ¶é´æ³ */
  timestamp?: string;
  /** çæç­¾åçéæºä¸² */
  nonceStr?: string;
  /** ç­¾å */
  signature?: string;
  /** éè¦ä½¿ç¨çJSæ¥å£åè¡¨ */
  jsApiList?: string[];
}
