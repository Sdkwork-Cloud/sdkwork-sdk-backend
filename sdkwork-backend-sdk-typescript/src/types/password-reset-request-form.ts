/** Password reset request form */
export interface PasswordResetRequestForm {
  /** Email account for password reset */
  email?: string;
  /** Phone account for password reset */
  phone?: string;
  resetTargetExclusive?: boolean;
  resetTargetPresent?: boolean;
}
