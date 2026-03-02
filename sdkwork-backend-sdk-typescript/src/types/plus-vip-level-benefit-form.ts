import type { VipLevelBenefitMetadata } from './vip-level-benefit-metadata';

/** VIP level benefit creation form */
export interface PlusVipLevelBenefitForm {
  /** VIP等级ID，关联plus_vip_level表 */
  vipLevelId: number;
  /** 权益ID，关联plus_vip_benefit表 */
  benefitId: number;
  /** 每日使用限制次数 */
  dailyLimit?: number;
  /** 每月使用限制次数 */
  monthlyLimit?: number;
  /** 总使用限制次数 */
  totalLimit?: number;
  /** 是否启用(1-启用 0-禁用) */
  status: 'ENABLED' | 'DISABLED';
  /** 扩展元数据(JSON格式) */
  metadata?: VipLevelBenefitMetadata;
  /** 备注信息 */
  remark?: string;
}
