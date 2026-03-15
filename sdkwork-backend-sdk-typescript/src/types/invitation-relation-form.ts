/** Invitation relation creation form */
export interface InvitationRelationForm {
  /** Inviter user ID */
  inviterUserId: number;
  /** Invitee user ID */
  inviteeUserId: number;
  /** Invite code */
  inviteCode: string;
  /** Used time */
  usedTime?: string;
  /** Relation level */
  relationLevel: number;
  /** Reward status */
  rewardStatus?: 'PENDING' | 'SUCCESS' | 'FAILED' | 'CANCELED';
  /** Reward amount */
  rewardAmount?: number;
  /** Reward type */
  rewardType?: 'POINTS' | 'CASH' | 'COUPON' | 'VIP_DAYS' | 'DISCOUNT' | 'FREE_SHIPPING' | 'UPGRADE' | 'GIFT' | 'LOTTERY_CHANCE' | 'STORAGE' | 'FEATURE_UNLOCK' | 'CREDIT' | 'CONTENT' | 'MIXED';
}
