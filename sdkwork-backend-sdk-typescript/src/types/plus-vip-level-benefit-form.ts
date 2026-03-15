import type { VipLevelBenefitMetadata } from './vip-level-benefit-metadata';

/** VIP level benefit creation form */
export interface PlusVipLevelBenefitForm {
  /** VIP level ID */
  vipLevelId: number;
  /** Benefit ID */
  benefitId: number;
  /** Daily limit */
  dailyLimit?: number;
  /** Monthly limit */
  monthlyLimit?: number;
  /** Total limit */
  totalLimit?: number;
  /** Benefit status */
  status: 'ENABLED' | 'DISABLED';
  /** Benefit metadata */
  metadata?: VipLevelBenefitMetadata;
  /** Remark */
  remark?: string;
}
