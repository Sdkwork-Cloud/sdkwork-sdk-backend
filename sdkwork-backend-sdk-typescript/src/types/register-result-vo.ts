import type { UserVO } from './user-vo';

/** æ³¨åç»æ */
export interface RegisterResultVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  user?: UserVO;
}
