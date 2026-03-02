import type { CartItem } from './cart-item';

/** 购物车分组信息 */
export interface CartGroup {
  /** 分组UUID */
  uuid?: string;
  /** 分组名称 */
  name?: string;
  /** 购物车项目列表 */
  items?: CartItem[];
  /** 分组内商品总数量 */
  totalQuantity?: number;
  /** 分组内商品总价格 */
  totalPrice?: number;
}
