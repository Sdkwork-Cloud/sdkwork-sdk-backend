import type { PlusVipLevelVO } from './plus-vip-level-vo';

/** VIPä¼åç¨æ·ä¿¡æ¯VO */
export interface PlusVipUserVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ID */
  id?: number;
  /** UUID */
  uuid?: string;
  /** ç¨æ·IDï¼å³èplus_userè¡¨ */
  userId?: number;
  /** å½åVIPç­çº§ID */
  vipLevelId?: number;
  /** ä¼åç¶æ */
  status?: 'DEFAULT' | 'ACTIVE' | 'EXPIRED' | 'FROZEN' | 'CANCELLED';
  /** å½åçµç¹(ç§¯å)ä½é¢ */
  pointBalance?: number;
  /** ç´¯è®¡åå¼çµç¹(ç§¯å) */
  totalRechargedPoints?: number;
  /** ä¼åæææå¼å§æ¶é´ */
  validFrom?: string;
  /** ä¼åæææç»ææ¶é´ */
  validTo?: string;
  /** æåæ´»è·æ¶é´ */
  lastActiveTime?: string;
  /** å¤æ³¨ä¿¡æ¯ */
  remark?: string;
  /** VIPç­çº§ä¿¡æ¯ */
  vipLevel?: PlusVipLevelVO;
}
