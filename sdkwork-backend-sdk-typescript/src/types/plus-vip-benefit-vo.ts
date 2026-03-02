/** VIP权益定义VO */
export interface PlusVipBenefitVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 权益ID */
  id?: number;
  /** 权益名称, e.g., '每月免费灵点', '专属客服' */
  name?: string;
  /** 权益的详细描述 */
  description?: string;
  /** 权益标识符，用于程序内部识别 */
  benefitKey?: string;
  /** 权益类型，用于程序内部处理 */
  type?: 'DEFAULT' | 'MONTHLY_FREE_POINTS' | 'DEDICATED_SUPPORT' | 'PURCHASE_DISCOUNT' | 'EXCLUSIVE_CONTENT' | 'PRIORITY_SERVICE' | 'BIRTHDAY_GIFT';
}
