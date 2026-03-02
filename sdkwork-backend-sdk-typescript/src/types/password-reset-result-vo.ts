/** 密码重置响应视图对象 */
export interface PasswordResetResultVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 是否成功 */
  success?: boolean;
  /** 消息 */
  message?: string;
  /** 过期时间（秒） */
  expiresIn?: number;
  /** 重置令牌 */
  token?: string;
}
