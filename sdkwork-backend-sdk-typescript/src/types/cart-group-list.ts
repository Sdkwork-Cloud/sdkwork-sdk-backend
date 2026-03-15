import type { CartGroup } from './cart-group';
import type { CartItem } from './cart-item';

/** Shopping cart group list */
export interface CartGroupList {
  /** Grouped cart items */
  groups?: CartGroup[];
  /** Total quantity of all items */
  totalQuantity?: number;
  /** Total price of all items */
  totalPrice?: number;
  /** Selected item quantity */
  selectedQuantity?: number;
  /** Selected item total price */
  selectedPrice?: number;
  allItems?: CartItem[];
}
