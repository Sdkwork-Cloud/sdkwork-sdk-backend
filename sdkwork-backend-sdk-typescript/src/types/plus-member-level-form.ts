/** Member level creation form */
export interface PlusMemberLevelForm {
  /** 所属会员卡ID */
  cardId: number;
  /** 等级名称，如“银卡”、“金卡” */
  levelName: string;
  /** 升级所需积分阈值 */
  requiredPoints: number;
  /** 等级特权描述 */
  description?: string;
  /** 等级状态：启用/禁用 */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DELETED';
}
