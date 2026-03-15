/** Change password form */
export interface ChangePasswordForm {
  /** User ID. If omitted, the current logged-in user is used. */
  userId?: string;
  /** Current password */
  oldPassword: string;
  /** New password */
  newPassword: string;
}
