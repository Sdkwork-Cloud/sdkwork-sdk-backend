import type { PlusVipPackVO } from './plus-vip-pack-vo';

/** VIP套餐分组VO */
export interface PlusVipPackGroupVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 主键ID */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 应用ID */
  appId?: number;
  /** 分组名称 */
  name?: string;
  /** 分组描述 */
  description?: string;
  /** 排序权重 */
  sortWeight?: number;
  /** 分组状态 */
  status?: 'DEFAULT' | 'ENABLED' | 'DISABLED';
  /** 备注信息 */
  remark?: string;
  /** 关联的套餐列表 */
  packs?: PlusVipPackVO[];
}
