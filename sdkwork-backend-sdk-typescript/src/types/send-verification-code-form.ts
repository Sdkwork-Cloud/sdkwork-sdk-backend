/** 发送验证码请求表单 */
export interface SendVerificationCodeForm {
  /** 标识符（邮箱或手机号） */
  identifier: string;
  /** 验证方式 */
  method: 'email' | 'phone';
  /** 验证类型 */
  type: 'login' | 'registration' | 'reset' | 'update';
}
