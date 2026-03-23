/** OAuthç¬¬ä¸æ¹ç»å½ååº */
export interface OAuthLoginResponseVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** OAuthæä¾åç±»å */
  provider?: 'WECHAT' | 'QQ' | 'WEIBO' | 'GITHUB' | 'GOOGLE' | 'FACEBOOK' | 'TWITTER' | 'LINKEDIN' | 'MICROSOFT' | 'APPLE' | 'ALIPAY' | 'DINGTALK' | 'GITEE';
  /** ææURL */
  authUrl?: string;
  /** äºç»´ç å¾çURL */
  qrCodeUrl?: string;
  /** äºç»´ç åå®¹ï¼Base64ç¼ç çå¾çæ°æ®ï¼ */
  qrCodeContent?: string;
  /** è¿ææ¶é´ï¼ç§ï¼ */
  expiresIn?: number;
}
