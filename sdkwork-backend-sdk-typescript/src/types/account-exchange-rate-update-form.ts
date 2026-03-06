/** 账户兑换比例更新表单 */
export interface AccountExchangeRateUpdateForm {
  /** 积分兑换现金比例（N积分=1元） */
  pointsToCashRate: number;
  /** 备注 */
  remarks?: string;
}
