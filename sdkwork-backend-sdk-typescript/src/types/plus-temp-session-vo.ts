import type { BucketObject } from './bucket-object';

/** æä»¶VOç±»ï¼ç¨äºå­å¨æä»¶çåæ°æ®ä¿¡æ¯ */
export interface PlusTempSessionVO {
  /** æä»¶ID */
  fileId?: number;
  /** ä¸´æ¶è®¿é® keyId */
  tmpAccessKeyId?: string;
  /** ä¸´æ¶è®¿é®å¯é¥ */
  tmpAccessKeySecret?: string;
  /** ä¼è¯ token */
  sessionToken?: string;
  /** å­è¯ææç§æ° */
  expirationSeconds?: number;
  /** ä¸ä¼ å°å */
  uploadUrl?: string;
  /** å¯¹è±¡ key */
  objectKey?: string;
  /** æ¡¶ä¿¡æ¯ */
  bucket?: BucketObject;
  /** åå»ºæ¶é´ */
  createTime?: string;
}
