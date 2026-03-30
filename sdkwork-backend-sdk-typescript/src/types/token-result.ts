/** 令牌结果信息 */
export interface TokenResult {
  /** 令牌字符串 */
  token: string;
  /** 令牌过期时间（毫秒） */
  expiresInMs: string;
  /** 令牌创建时间（毫秒时间戳） */
  createdAt: string;
  expired?: boolean;
}
