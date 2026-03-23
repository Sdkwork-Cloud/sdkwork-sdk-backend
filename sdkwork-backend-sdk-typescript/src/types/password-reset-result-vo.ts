/** å¯ç éç½®ååºè§å¾å¯¹è±¡ */
export interface PasswordResetResultVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** æ¯å¦æå */
  success?: boolean;
  /** æ¶æ¯ */
  message?: string;
  /** è¿ææ¶é´ï¼ç§ï¼ */
  expiresIn?: number;
  /** éç½®ä»¤ç */
  token?: string;
}
