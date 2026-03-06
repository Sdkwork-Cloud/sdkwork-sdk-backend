/** OAuth第三方登录响应 */
export interface OAuthLoginResponseVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** OAuth提供商类型 */
  provider?: 'WECHAT' | 'QQ' | 'WEIBO' | 'GITHUB' | 'GOOGLE' | 'FACEBOOK' | 'TWITTER' | 'LINKEDIN' | 'MICROSOFT' | 'APPLE' | 'ALIPAY' | 'DINGTALK' | 'GITEE';
  /** 授权URL */
  authUrl?: string;
  /** 二维码图片URL */
  qrCodeUrl?: string;
  /** 二维码内容（Base64编码的图片数据） */
  qrCodeContent?: string;
  /** 过期时间（秒） */
  expiresIn?: number;
}
