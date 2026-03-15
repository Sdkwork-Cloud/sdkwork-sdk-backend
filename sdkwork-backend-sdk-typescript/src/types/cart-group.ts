import type { CartItem } from './cart-item';

/** Shopping cart group information */
export interface CartGroup {
  /** Group UUID */
  uuid?: string;
  /** Group name */
  name?: string;
  /** Shopping cart items in the group */
  items?: CartItem[];
  /** Total quantity in the group */
  totalQuantity?: number;
  /** Total price in the group */
  totalPrice?: number;
}
