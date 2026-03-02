/** Recharge record creation form */
export interface PlusVipRechargeForm {
  /** 用户ID，关联plus_user表 */
  userId: number;
  /** VIP等级ID，关联plus_vip_level表 */
  vipLevelId?: number;
  /** 充值金额(元) */
  amount: number;
  /** 充值获得的灵点数量 */
  pointAmount: number;
  /** 充值类型 */
  rechargeType: 'DEFAULT' | 'DIRECT' | 'PACKAGE' | 'PROMOTION' | 'GIFT';
  /** 充值时间 */
  rechargeTime: string;
  /** 交易流水号 */
  transactionNo?: string;
  /** 充值状态(1-成功 2-失败 3-处理中) */
  status: number;
  /** 备注信息 */
  remark?: string;
}
