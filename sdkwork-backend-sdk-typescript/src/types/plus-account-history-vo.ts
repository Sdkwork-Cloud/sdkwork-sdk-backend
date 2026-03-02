/** 账户流水VO(包含资金和积分) */
export interface PlusAccountHistoryVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 资产类型 (BALANCE-资金, POINT-积分) */
  assetType?: 'DEFAULT' | 'BALANCE' | 'POINT' | 'TOKEN';
  /** 关联的账户ID */
  accountId?: number;
  /** 外部交易号或业务唯一标识，用于幂等控制 */
  transactionId?: string;
  /** 交易类型 (1-充值, 2-提现, 3-退款, 4-转账, 5-调账, 6-积分获得, 7-积分使用, 8-积分过期, 9-收益) */
  transactionType?: 'DEFAULT' | 'DEPOSIT' | 'WITHDRAW' | 'REFUND' | 'TRANSFER' | 'ADJUST' | 'INCOME' | 'FROZEN' | 'UNFROZEN' | 'DEDUCT' | 'RECHARGE' | 'CONSUME' | 'POINT_EARN' | 'POINT_USE' | 'POINT_EXPIRE' | 'POINT_TRANSFER' | 'POINT_ADJUST' | 'POINT_REFUND' | 'POINT_FROZEN' | 'POINT_UNFROZEN' | 'TOKEN_DEPOSIT' | 'TOKEN_USE' | 'TOKEN_REFUND' | 'TOKEN_FROZEN' | 'TOKEN_UNFROZEN' | 'TOKEN_TRANSFER' | 'TOKEN_ADJUST' | 'TOKEN_EXPIRE' | 'SYSTEM_ADJUST' | 'OTHER';
  /** 变动金额 (资金专用) */
  amount?: number;
  /** 交易前账户余额 (资金专用) */
  balanceBefore?: number;
  /** 交易后账户余额 (资金专用) */
  balanceAfter?: number;
  /** 关联账户ID (如转账时的对方账户) */
  relatedAccountId?: number;
  /** 变动积分值 (积分专用) */
  pointsChange?: number;
  /** 变动前账户积分 (积分专用) */
  pointsBefore?: number;
  /** 变动后账户积分 (积分专用) */
  pointsAfter?: number;
  /** 来源类型 (1-订单, 2-活动, 3-签到, 4-分享, 5-邀请, 6-系统奖励, 99-其他) */
  sourceType?: 'DEFAULT' | 'ORDER' | 'ACTIVITY' | 'SIGN_IN' | 'SHARE' | 'INVITE' | 'SYSTEM' | 'OTHER';
  /** 来源业务ID (如订单ID、活动ID) */
  sourceId?: string;
  /** 积分过期时间 (积分专用) */
  expiredAt?: string;
  /** 交易状态 (1-处理中, 2-成功, 3-失败) */
  status?: 'DEFAULT' | 'PROCESSING' | 'SUCCESS' | 'FAILED' | 'CANCELLED';
  /** 备注信息，可存JSON或其他文本 */
  remarks?: string;
}
