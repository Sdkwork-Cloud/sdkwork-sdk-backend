/** OAuth provider account lifecycle status change form */
export interface OAuthProviderAccountStatusChangeForm {
  /** Target account status */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** Whether the operator has reviewed bound app impact for disabling operations */
  acknowledgeImpact?: boolean;
}
