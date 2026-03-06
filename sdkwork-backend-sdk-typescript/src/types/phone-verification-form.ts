/** 手机验证请求表单 */
export interface PhoneVerificationForm {
  /** 手机号 */
  phone: string;
  /** 验证码 */
  code: string;
  /** 验证类型（业务场景） */
  type: string;
}
