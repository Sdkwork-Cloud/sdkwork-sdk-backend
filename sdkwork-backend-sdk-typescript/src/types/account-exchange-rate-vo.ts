/** 账户兑换比例VO */
export interface AccountExchangeRateVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 配置键 */
  configKey?: string;
  /** 积分兑换现金比例（N积分=1元） */
  pointsToCashRate?: number;
  /** 备注 */
  remarks?: string;
}
