import type { CartItem } from './cart-item';

/** Create goods order form */
export interface CreateGoodsOrderForm {
  /** è®¢ååå®¹é¡¹åè¡¨ */
  items?: CartItem[];
  /** èæååæææ */
  expireTime?: string;
}
