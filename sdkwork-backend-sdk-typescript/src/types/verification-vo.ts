/** éªè¯ååºè§å¾å¯¹è±¡ */
export interface VerificationVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** æ¯å¦éªè¯æå */
  success?: boolean;
  /** æ¶æ¯ */
  message?: string;
  /** éªè¯ä»¤ç */
  token?: string;
}
