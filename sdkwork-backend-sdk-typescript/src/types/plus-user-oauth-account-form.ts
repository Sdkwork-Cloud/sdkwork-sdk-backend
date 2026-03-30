/** User OAuth account creation form */
export interface PlusUserOAuthAccountForm {
  /** 鐢ㄦ埛ID */
  userId: number;
  /** OAuth骞冲彴绫诲瀷 */
  oauthProvider: 'WECHAT' | 'QQ' | 'WEIBO' | 'GITHUB' | 'GOOGLE' | 'FACEBOOK' | 'TWITTER' | 'LINKEDIN' | 'MICROSOFT' | 'APPLE' | 'ALIPAY' | 'DINGTALK' | 'GITEE' | 'DOUYIN';
  /** 寮€鏀惧钩鍙癐D */
  openId: string;
  /** 缁熶竴ID */
  unionId?: string;
  /** 搴旂敤ID */
  appId?: string;
  /** 娓犻亾璐︽埛ID */
  channelAccountId?: number;
  /** 璁块棶浠ょ墝杩囨湡鏃堕棿 */
  accessTokenExpiresAt?: string;
}
