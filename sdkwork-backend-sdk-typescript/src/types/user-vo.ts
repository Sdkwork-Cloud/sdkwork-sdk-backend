/** ç¨æ·ä¿¡æ¯è§å¾å¯¹è±¡ */
export interface UserVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ç¨æ·ID */
  id: number;
  /** ç¨æ·å */
  username: string;
  /** çµå­é®ç®± */
  email?: string;
  /** ææºå·ç  */
  phone?: string;
}
