/** VIP benefit usage creation form */
export interface PlusVipBenefitUsageForm {
  /** 用户ID，关联plus_user表 */
  userId: number;
  /** 权益类型 */
  benefitType: 'DEFAULT' | 'MONTHLY_FREE_POINTS' | 'DEDICATED_SUPPORT' | 'PURCHASE_DISCOUNT' | 'EXCLUSIVE_CONTENT' | 'PRIORITY_SERVICE' | 'BIRTHDAY_GIFT';
  /** 使用时间 */
  usageTime: string;
  /** 使用数量 */
  usageCount: number;
  /** 状态(1-成功 2-失败) */
  status: number;
  /** 业务来源ID(如订单ID等) */
  sourceId?: number;
  /** 业务来源类型 */
  sourceType?: string;
  /** 备注信息 */
  remark?: string;
}
