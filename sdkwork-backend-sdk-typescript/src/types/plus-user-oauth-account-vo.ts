/** ç¨æ·OAuthè´¦æ·å¼å¯¹è±¡ */
export interface PlusUserOAuthAccountVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦ */
  uuid?: string;
  /** ç¨æ·ID */
  userId?: number;
  /** OAuthå¹³å°ç±»å */
  oauthProvider?: 'WECHAT' | 'QQ' | 'WEIBO' | 'GITHUB' | 'GOOGLE' | 'FACEBOOK' | 'TWITTER' | 'LINKEDIN' | 'MICROSOFT' | 'APPLE' | 'ALIPAY' | 'DINGTALK' | 'GITEE';
  /** å¼æ¾å¹³å°ID */
  openId?: string;
  /** ç»ä¸ID */
  unionId?: string;
  /** åºç¨ID */
  appId?: string;
  /** æ¸ éè´¦æ·ID */
  channelAccountId?: number;
  /** è®¿é®ä»¤çè¿ææ¶é´ */
  accessTokenExpiresAt?: string;
}
