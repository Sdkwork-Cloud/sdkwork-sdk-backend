import type { CartGroupList } from './cart-group-list';

/** Shopping cart creation form */
export interface PlusShoppingCartForm {
  /** 购物车所有者（枚举值：USER/PLATFORM等） */
  owner: 'DEFAULT' | 'USER' | 'PROJECT' | 'TENANT' | 'SYSTEM' | 'ORGANIZATION';
  /** 购物车所有者ID（关联用户/平台ID） */
  ownerId: number;
  /** 购物车名称 */
  name?: string;
  /** 购物车描述 */
  description?: string;
  /** 购物车项目列表（JSON格式） */
  groupList?: CartGroupList;
  /** 购物车状态（枚举值：ACTIVE/INACTIVE等） */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
}
