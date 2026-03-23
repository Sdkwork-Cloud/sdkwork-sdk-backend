/** éè¯·å³ç³»VO */
export interface InvitationRelationVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ID */
  id?: number;
  /** UUID */
  uuid?: string;
  /** éè¯·äººç¨æ·ID */
  inviterUserId?: number;
  /** è¢«éè¯·äººç¨æ·ID */
  inviteeUserId?: number;
  /** éè¯·ç  */
  inviteCode?: string;
  /** ä½¿ç¨æ¶é´ */
  usedTime?: string;
  /** å³ç³»ç­çº§ï¼1=ç´æ¥ï¼2=äºçº§ç­ï¼ */
  relationLevel?: number;
  /** å¥å±ç¶æ */
  rewardStatus?: 'PENDING' | 'SUCCESS' | 'FAILED' | 'CANCELED';
  /** å¥å±éé¢ */
  rewardAmount?: number;
  /** å¥å±ç±»å */
  rewardType?: 'POINTS' | 'CASH' | 'COUPON' | 'VIP_DAYS' | 'DISCOUNT' | 'FREE_SHIPPING' | 'UPGRADE' | 'GIFT' | 'LOTTERY_CHANCE' | 'STORAGE' | 'FEATURE_UNLOCK' | 'CREDIT' | 'CONTENT' | 'MIXED';
}
