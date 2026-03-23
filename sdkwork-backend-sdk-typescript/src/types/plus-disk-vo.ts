/** æä»¶å­å¨çä¿¡æ¯VO */
export interface PlusDiskVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** å­å¨çåç§° */
  name?: string;
  /** å­å¨çææèç±»å */
  owner?: 'DEFAULT' | 'USER' | 'PROJECT' | 'TENANT' | 'SYSTEM' | 'ORGANIZATION';
  /** ææèID */
  ownerId?: number;
  /** æ»å®¹éï¼å­èï¼ */
  diskSize?: number;
  /** å·²ä½¿ç¨å®¹éï¼å­èï¼ */
  usedSize?: number;
  /** å­å¨çæè¿° */
  description?: string;
  /** å©ä½å¯ç¨å®¹éï¼å­èï¼ */
  remainingSize?: number;
  /** å­å¨çä½¿ç¨çï¼ç¾åæ¯ï¼ */
  usageRate?: number;
}
