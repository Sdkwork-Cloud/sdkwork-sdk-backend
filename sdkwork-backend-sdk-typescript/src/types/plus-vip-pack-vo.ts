import type { PlusVipLevelVO } from './plus-vip-level-vo';

/** VIP套餐VO */
export interface PlusVipPackVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 主键ID */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 套餐名称 */
  name?: string;
  /** 套餐描述 */
  description?: string;
  /** 所属分组ID */
  groupId?: number;
  /** 关联的VIP等级ID */
  vipLevelId?: number;
  /** 套餐价格(元) */
  price?: number;
  /** 赠送灵点数量 */
  pointAmount?: number;
  /** VIP时长(天) */
  vipDurationDays?: number;
  /** 套餐状态 */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE';
  /** 排序权重 */
  sortWeight?: number;
  /** 套餐有效期开始时间 */
  validFrom?: string;
  /** 套餐有效期结束时间 */
  validTo?: string;
  /** 备注信息 */
  remark?: string;
  /** 关联的VIP等级集合 */
  vipLevel?: PlusVipLevelVO;
}
