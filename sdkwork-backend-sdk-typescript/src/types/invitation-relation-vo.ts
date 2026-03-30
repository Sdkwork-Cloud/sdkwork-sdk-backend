/** 邀请关系VO */
export interface InvitationRelationVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** ID */
  id?: number;
  /** UUID */
  uuid?: string;
  /** 邀请人用户ID */
  inviterUserId?: number;
  /** 被邀请人用户ID */
  inviteeUserId?: number;
  /** 邀请码 */
  inviteCode?: string;
  /** 使用时间 */
  usedTime?: string;
  /** 关系等级（1=直接，2=二级等） */
  relationLevel?: number;
  /** 奖励状态 */
  rewardStatus?: 'PENDING' | 'SUCCESS' | 'FAILED' | 'CANCELED';
  /** 奖励金额 */
  rewardAmount?: number;
  /** 奖励类型 */
  rewardType?: 'POINTS' | 'CASH' | 'COUPON' | 'VIP_DAYS' | 'DISCOUNT' | 'FREE_SHIPPING' | 'UPGRADE' | 'GIFT' | 'LOTTERY_CHANCE' | 'STORAGE' | 'FEATURE_UNLOCK' | 'CREDIT' | 'CONTENT' | 'MIXED';
}
