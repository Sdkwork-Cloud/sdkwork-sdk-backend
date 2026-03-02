/** User OAuth account creation form */
export interface PlusUserOAuthAccountForm {
  /** 用户ID */
  userId: number;
  /** OAuth平台类型 */
  oauthProvider: 'WECHAT' | 'QQ' | 'WEIBO' | 'GITHUB' | 'GOOGLE' | 'FACEBOOK' | 'TWITTER' | 'LINKEDIN' | 'MICROSOFT' | 'APPLE' | 'ALIPAY' | 'DINGTALK' | 'GITEE';
  /** 开放平台ID */
  openId: string;
  /** 统一ID */
  unionId?: string;
  /** 应用ID */
  appId?: string;
  /** 渠道账户ID */
  channelAccountId?: number;
  /** 访问令牌过期时间 */
  accessTokenExpiresAt?: string;
}
