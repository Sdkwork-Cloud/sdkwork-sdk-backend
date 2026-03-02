/** VIP user creation form */
export interface PlusVipUserForm {
  /** 用户ID，关联plus_user表 */
  userId: number;
  /** 当前VIP等级ID */
  vipLevelId?: number;
  /** 会员状态 */
  status: 'DEFAULT' | 'ACTIVE' | 'EXPIRED' | 'FROZEN' | 'CANCELLED';
  /** 当前灵点(积分)余额 */
  pointBalance: number;
  /** 累计充值灵点(积分) */
  totalRechargedPoints: number;
  /** 会员有效期开始时间 */
  validFrom?: string;
  /** 会员有效期结束时间 */
  validTo?: string;
  /** 最后活跃时间 */
  lastActiveTime?: string;
  /** 备注信息 */
  remark?: string;
}
