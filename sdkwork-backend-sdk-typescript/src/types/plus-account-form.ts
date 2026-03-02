/** Account creation form */
export interface PlusAccountForm {
  /** 关联的用户ID，对应 plus_user 表的主键 */
  userId: number;
  /** 可用余额 */
  availableBalance: number;
  /** 冻结余额，例如提现申请中 */
  frozenBalance: number;
  /** 当前可用积分 */
  availablePoints: number;
  /** 当前冻结积分 */
  frozenPoints: number;
  /** 账户状态 (1-激活, 2-冻结, 3-已注销) */
  status: 'DEFAULT' | 'ACTIVE' | 'FROZEN' | 'CLOSED';
}
