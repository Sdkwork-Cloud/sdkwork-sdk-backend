/** éè¯·ç VOå¯¹è±¡ */
export interface InvitationCodeVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** éè¯·ç å¼ */
  code?: string;
  /** åå»ºèID */
  creatorUserId?: number;
  /** éè¯·ç ç¶æ */
  status?: 'UNUSED' | 'USED' | 'EXPIRED' | 'INVALID';
  /** è¿ææ¶é´ */
  expireTime?: string;
  /** ä½¿ç¨éå¶æ¬¡æ° */
  usageLimit?: number;
  /** å·²ä½¿ç¨æ¬¡æ° */
  usedCount?: number;
}
