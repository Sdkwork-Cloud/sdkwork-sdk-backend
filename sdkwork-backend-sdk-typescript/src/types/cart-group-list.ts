import type { CartGroup } from './cart-group';
import type { CartItem } from './cart-item';

/** 购物车分组列表 */
export interface CartGroupList {
  /** 购物车分组列表 */
  groups?: CartGroup[];
  /** 购物车商品总数量 */
  totalQuantity?: number;
  /** 购物车商品总价格 */
  totalPrice?: number;
  /** 选中商品总数量 */
  selectedQuantity?: number;
  /** 选中商品总价格 */
  selectedPrice?: number;
  allItems?: CartItem[];
}
