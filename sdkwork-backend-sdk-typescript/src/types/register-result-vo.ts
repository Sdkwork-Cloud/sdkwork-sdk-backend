import type { UserVO } from './user-vo';

/** 注册结果 */
export interface RegisterResultVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  user?: UserVO;
}
