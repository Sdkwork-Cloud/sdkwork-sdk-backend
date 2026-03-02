/** VIP level creation form */
export interface PlusVipLevelForm {
  /** 等级名称, e.g., 黄金会员, 铂金会员 */
  name: string;
  /** 等级值，用于排序和内部逻辑判断, e.g., 1 for Gold, 2 for Platinum */
  levelValue: number;
  /** 晋升到此等级所需的累计灵点数 */
  requiredPoints: number;
  /** 等级描述 */
  description?: string;
}
