/** 登录请求表单 */
export interface LoginForm {
  /** 登录类型 */
  type?: 'MOBILE' | 'EMAIL' | 'OAUTH' | 'USERNAME';
  /** 邮箱 */
  email?: string;
  /** 手机号 */
  phone?: string;
  /** 用户名 */
  username: string;
  /** 密码 */
  password: string;
  /** 平台 */
  owner?: 'DEFAULT' | 'TENANT' | 'ORGANIZATION';
  /** 验证码 */
  captcha?: string;
  /** 验证码ID */
  captchaId?: string;
  /** 记住我 */
  rememberMe?: boolean;
  /** 验证码 */
  verificationCode?: string;
  /** 邀请码 */
  invitationCode?: string;
}
