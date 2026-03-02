/** 用户注册请求表单 */
export interface RegisterForm {
  /** 用户名 */
  username?: string;
  /** 密码 */
  password: string;
  /** 确认密码 */
  confirmPassword?: string;
  /** 邮箱 */
  email?: string;
  /** 手机号 */
  phone?: string;
  /** 验证码 */
  captcha?: string;
  /** 验证码ID */
  captchaId?: string;
  /** 注册类型 */
  type?: 'DEFAULT' | 'EMAIL' | 'PHONE';
  /** 验证码 */
  verificationCode?: string;
  /** 邀请码 */
  invitationCode?: string;
}
