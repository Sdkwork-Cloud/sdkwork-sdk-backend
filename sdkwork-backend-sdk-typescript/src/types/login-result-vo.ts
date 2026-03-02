import type { UserVO } from './user-vo';

/** 认证令牌信息 */
export interface LoginResultVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 访问令牌 */
  token: string;
  /** 刷新令牌 */
  refreshToken: string;
  /** 访问令牌过期时间(秒) */
  expiresIn: number;
  /** 刷新令牌过期时间(秒) */
  refreshExpiresIn: number;
  /** 用户id */
  userId: number;
  /** 用户信息 */
  user?: UserVO;
}
