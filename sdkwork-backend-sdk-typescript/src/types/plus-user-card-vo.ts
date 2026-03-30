/** 用户会员卡VO，用于表示用户与会员卡的绑定关系 */
export interface PlusUserCardVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 用户ID（引用plus_user表） */
  userId?: number;
  /** 会员卡模板ID */
  cardId?: number;
  /** 用户会员卡的卡号/Code */
  cardCode?: string;
  /** 领取时间 */
  acquireTime?: string;
  /** 激活时间 */
  activateTime?: string;
  /** 注销/到期时间 */
  cancelTime?: string;
  /** 当前积分余额 */
  points?: number;
  /** 当前储值余额 */
  balance?: number;
}
