/** 密码重置表单 */
export interface PasswordResetForm {
  /** 密码重置令牌 */
  token: string;
  /** 新密码 */
  newPassword: string;
}
