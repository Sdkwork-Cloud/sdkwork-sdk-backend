/** 会员等级VO，包含等级名称、所需积分、特权描述等信息 */
export interface PlusMemberLevelVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 会员等级ID */
  id?: number;
  /** 所属会员卡ID */
  cardId?: number;
  /** 等级名称，如“银卡”、“金卡” */
  levelName?: string;
  /** 升级所需积分阈值 */
  requiredPoints?: number;
  /** 等级特权描述 */
  description?: string;
  /** 等级状态：启用/禁用 */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DELETED';
}
