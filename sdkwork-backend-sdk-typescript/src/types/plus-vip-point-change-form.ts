/** Point change creation form */
export interface PlusVipPointChangeForm {
  /** 用户ID，关联plus_user表 */
  userId: number;
  /** 变动类型 */
  changeType: 'DEFAULT' | 'RECHARGE' | 'CONSUME' | 'REWARD' | 'ADJUST' | 'EXPIRE';
  /** 变动数量(正数为增加，负数为减少) */
  changeAmount: number;
  /** 变动前余额 */
  beforeBalance: number;
  /** 变动后余额 */
  afterBalance: number;
  /** 业务来源ID(如充值记录ID、订单ID等) */
  sourceId?: number;
  /** 业务来源类型 */
  sourceType?: string;
  /** 备注信息 */
  remark?: string;
}
