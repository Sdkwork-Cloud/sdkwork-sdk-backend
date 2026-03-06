import type { CartItem } from './cart-item';

/** Create goods order form */
export interface CreateGoodsOrderForm {
  /** 订单内容项列表 */
  items?: CartItem[];
  /** 虚拟商品有效期 */
  expireTime?: string;
}
