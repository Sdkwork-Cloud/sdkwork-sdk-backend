import type { UserVO } from './user-vo';

/** è®¤è¯ä»¤çä¿¡æ¯ */
export interface LoginResultVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** è®¿é®ä»¤ç */
  token: string;
  /** å·æ°ä»¤ç */
  refreshToken: string;
  /** è®¿é®ä»¤çè¿ææ¶é´(ç§) */
  expiresIn: number;
  /** å·æ°ä»¤çè¿ææ¶é´(ç§) */
  refreshExpiresIn: number;
  /** ç¨æ·id */
  userId: number;
  /** ç¨æ·ä¿¡æ¯ */
  user?: UserVO;
}
