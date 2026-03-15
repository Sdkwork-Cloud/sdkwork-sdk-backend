/** Invitation code creation form */
export interface InvitationCodeForm {
  /** Invitation code */
  code: string;
  /** Creator user ID */
  creatorUserId: number;
  /** Status */
  status?: 'UNUSED' | 'USED' | 'EXPIRED' | 'INVALID';
  /** Expire time */
  expireTime: string;
  /** Usage limit */
  usageLimit?: number;
  /** Used count */
  usedCount?: number;
}
