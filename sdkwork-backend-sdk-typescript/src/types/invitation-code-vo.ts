/** 邀请码VO对象 */
export interface InvitationCodeVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 邀请码值 */
  code?: string;
  /** 创建者ID */
  creatorUserId?: number;
  /** 邀请码状态 */
  status?: 'UNUSED' | 'USED' | 'EXPIRED' | 'INVALID';
  /** 过期时间 */
  expireTime?: string;
  /** 使用限制次数 */
  usageLimit?: number;
  /** 已使用次数 */
  usedCount?: number;
}
