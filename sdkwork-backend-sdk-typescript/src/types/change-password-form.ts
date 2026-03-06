/** 修改密码表单 */
export interface ChangePasswordForm {
  /** 用户ID（可选，不传则使用当前登录用户） */
  userId?: string;
  /** 旧密码 */
  oldPassword: string;
  /** 新密码 */
  newPassword: string;
}
