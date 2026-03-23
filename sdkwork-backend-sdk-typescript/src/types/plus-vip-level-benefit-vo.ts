import type { VipLevelBenefitMetadata } from './vip-level-benefit-metadata';

/** VIPç­çº§æçå³èVO */
export interface PlusVipLevelBenefitVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** VIPç­çº§IDï¼å³èplus_vip_levelè¡¨ */
  vipLevelId?: number;
  /** æçIDï¼å³èplus_vip_benefitè¡¨ */
  benefitId?: number;
  /** æ¯æ¥ä½¿ç¨éå¶æ¬¡æ° */
  dailyLimit?: number;
  /** æ¯æä½¿ç¨éå¶æ¬¡æ° */
  monthlyLimit?: number;
  /** æ»ä½¿ç¨éå¶æ¬¡æ° */
  totalLimit?: number;
  /** æ¯å¦å¯ç¨(1-å¯ç¨ 0-ç¦ç¨) */
  status?: 'ENABLED' | 'DISABLED';
  /** æ©å±åæ°æ®(JSONæ ¼å¼) */
  metadata?: VipLevelBenefitMetadata;
  /** å¤æ³¨ä¿¡æ¯ */
  remark?: string;
}
