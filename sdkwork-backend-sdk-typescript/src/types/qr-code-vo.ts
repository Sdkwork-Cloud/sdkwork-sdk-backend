/** äºç»´ç çæååº */
export interface QrCodeVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** äºç»´ç å¯ä¸æ è¯ */
  qrKey?: string;
  /** äºç»´ç å¾çURL */
  qrUrl?: string;
  /** äºç»´ç åå®¹(ç¨äºåç«¯çæ) */
  qrContent?: string;
  /** è¿ææ¶é´(ç§) */
  expireTime?: number;
}
