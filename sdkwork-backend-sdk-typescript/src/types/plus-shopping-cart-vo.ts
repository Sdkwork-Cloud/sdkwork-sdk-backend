import type { CartGroupList } from './cart-group-list';

/** 购物车VO */
export interface PlusShoppingCartVO {
  /** 创建时间 */
  createdAt?: string;
  /** 最后更新时间 */
  updatedAt?: string;
  /** 购物车ID */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 购物车所有者 */
  owner?: 'DEFAULT' | 'USER' | 'PROJECT' | 'TENANT' | 'SYSTEM' | 'ORGANIZATION';
  /** 购物车所有者ID */
  ownerId?: number;
  /** 购物车名称 */
  name?: string;
  /** 购物车描述 */
  description?: string;
  /** 购物车项目列表 */
  groupList?: CartGroupList;
  /** 购物车状态 */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
}
