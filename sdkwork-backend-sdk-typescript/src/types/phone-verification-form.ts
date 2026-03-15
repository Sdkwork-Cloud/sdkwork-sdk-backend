/** Phone verification request form */
export interface PhoneVerificationForm {
  /** Phone number */
  phone: string;
  /** Verification code */
  code: string;
  /** Verification type */
  type: string;
}
