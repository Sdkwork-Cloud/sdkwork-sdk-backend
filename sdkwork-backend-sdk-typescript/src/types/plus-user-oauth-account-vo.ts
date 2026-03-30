/** 用户OAuth账户值对象 */
export interface PlusUserOAuthAccountVO {
  /** 创建时间 */
  createdAt?: string;
  /** 最后更新时间 */
  updatedAt?: string;
  /** 主键ID */
  id?: number;
  /** 通用唯一标识符 */
  uuid?: string;
  /** 用户ID */
  userId?: number;
  /** OAuth平台类型 */
  oauthProvider?: 'WECHAT' | 'QQ' | 'WEIBO' | 'GITHUB' | 'GOOGLE' | 'FACEBOOK' | 'TWITTER' | 'LINKEDIN' | 'MICROSOFT' | 'APPLE' | 'ALIPAY' | 'DINGTALK' | 'GITEE' | 'DOUYIN';
  /** 开放平台ID */
  openId?: string;
  /** 统一ID */
  unionId?: string;
  /** 应用ID */
  appId?: string;
  /** 渠道账户ID */
  channelAccountId?: number;
  /** 访问令牌过期时间 */
  accessTokenExpiresAt?: string;
}
