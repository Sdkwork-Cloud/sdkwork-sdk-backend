/** 验证响应视图对象 */
export interface VerificationVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 是否验证成功 */
  success?: boolean;
  /** 消息 */
  message?: string;
  /** 验证令牌 */
  token?: string;
}
