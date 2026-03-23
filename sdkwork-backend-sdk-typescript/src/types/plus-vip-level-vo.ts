import type { PlusVipBenefitVO } from './plus-vip-benefit-vo';

/** VIPç­çº§VOï¼åå«VIPç­çº§çåºæ¬ä¿¡æ¯åæçIDéå */
export interface PlusVipLevelVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** VIPç­çº§ID */
  id?: number;
  /** ç­çº§åç§°, e.g., é»éä¼å, ééä¼å */
  name?: string;
  /** ç­çº§å¼ï¼ç¨äºæåºååé¨é»è¾å¤æ­, e.g., 1 for Gold, 2 for Platinum */
  levelValue?: number;
  /** æåå°æ­¤ç­çº§æéçç´¯è®¡çµç¹æ° */
  requiredPoints?: number;
  /** ç­çº§æè¿° */
  description?: string;
  /** è¯¥ç­çº§æ¥æçæçIDéå */
  benefitIds?: number[];
  /** è¯¥ç­çº§æ¥æçæçéå */
  benefits?: PlusVipBenefitVO[];
}
