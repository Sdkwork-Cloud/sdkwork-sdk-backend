import type { PlusVipBenefitVO } from './plus-vip-benefit-vo';

/** VIP等级VO，包含VIP等级的基本信息及权益ID集合 */
export interface PlusVipLevelVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** VIP等级ID */
  id?: number;
  /** 等级名称, e.g., 黄金会员, 铂金会员 */
  name?: string;
  /** 等级值，用于排序和内部逻辑判断, e.g., 1 for Gold, 2 for Platinum */
  levelValue?: number;
  /** 晋升到此等级所需的累计灵点数 */
  requiredPoints?: number;
  /** 等级描述 */
  description?: string;
  /** 该等级拥有的权益ID集合 */
  benefitIds?: number[];
  /** 该等级拥有的权益集合 */
  benefits?: PlusVipBenefitVO[];
}
