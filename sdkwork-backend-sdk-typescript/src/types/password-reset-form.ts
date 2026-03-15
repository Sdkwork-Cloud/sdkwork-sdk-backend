/** Password reset form */
export interface PasswordResetForm {
  /** Password reset token in account:code format */
  token: string;
  /** New password */
  newPassword: string;
}
