import type { PlusSku } from './plus-sku';

/** Shopping cart item information */
export interface CartItem {
  /** Shopping cart item ID */
  id?: number;
  /** Associated SKU information */
  sku?: PlusSku;
  /** Product quantity */
  quantity?: number;
  /** Unit price */
  unitPrice?: number;
  /** Total price */
  totalPrice?: number;
  /** Whether the item is selected */
  selected?: boolean;
}
