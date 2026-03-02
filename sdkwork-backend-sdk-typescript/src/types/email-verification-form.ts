/** 邮箱验证请求表单 */
export interface EmailVerificationForm {
  /** 邮箱地址 */
  email: string;
  /** 验证码 */
  code: string;
  /** 验证类型 */
  type: 'registration' | 'reset' | 'update';
}
