/** Invitation code creation form */
export interface InvitationCodeForm {
  /** 邀请码值 */
  code: string;
  /** 创建者ID */
  creatorUserId: number;
  /** 邀请码状态 */
  status: 'UNUSED' | 'USED' | 'EXPIRED' | 'INVALID';
  /** 过期时间 */
  expireTime?: string;
  /** 使用限制次数 */
  usageLimit?: number;
  /** 已使用次数 */
  usedCount?: number;
}
