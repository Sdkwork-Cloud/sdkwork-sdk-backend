/** APIå¯é¥VOç±»ï¼ç¨äºä¼ è¾ç³»ç»ä¸­APIè®¿é®å­è¯ä¿¡æ¯ */
export interface PlusApiKeyVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** APIå¯é¥åç§° */
  name?: string;
  /** APIå¯é¥å¼ */
  keyValue?: string;
  /** è±æåçAPIå¯é¥å¼ */
  maskedKeyValue?: string;
  /** APIå¯é¥ç±»å */
  type?: 'DEFAULT' | 'SYSTEM' | 'USER' | 'APPLICATION' | 'INTEGRATION';
  /** APIå¯é¥ç¶æ */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'EXPIRED' | 'REVOKED';
  /** APIå¯é¥è¿ææ¶é´ */
  expireTime?: string;
  /** APIå¯é¥æè¿° */
  description?: string;
  /** æåä½¿ç¨æ¶é´ */
  lastUsedTime?: string;
}
