/** 修改密码表单 */
export interface ChangePasswordForm {
  /** 用户ID */
  userId: string;
  /** 旧密码 */
  oldPassword: string;
  /** 新密码 */
  newPassword: string;
}
