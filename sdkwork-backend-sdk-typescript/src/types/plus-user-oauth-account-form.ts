/** User OAuth account creation form */
export interface PlusUserOAuthAccountForm {
  /** é¢ã¦åID */
  userId: number;
  /** OAuthéªå²å½´ç»«è¯²ç· */
  oauthProvider: 'WECHAT' | 'QQ' | 'WEIBO' | 'GITHUB' | 'GOOGLE' | 'FACEBOOK' | 'TWITTER' | 'LINKEDIN' | 'MICROSOFT' | 'APPLE' | 'ALIPAY' | 'DINGTALK' | 'GITEE';
  /** å¯®â¬éæ§é©éçD */
  openId: string;
  /** ç¼ç¶ç«´ID */
  unionId?: string;
  /** æ´ææ¤ID */
  appId?: string;
  /** å¨ç»äº¾çï¸½åID */
  channelAccountId?: number;
  /** çåæ£¶æµ ãå¢æ©å¨æ¹¡éå æ£¿ */
  accessTokenExpiresAt?: string;
}
