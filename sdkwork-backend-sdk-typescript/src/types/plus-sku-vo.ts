/** Product SKU Value Object */
export interface PlusSkuVO {
  /** Creation time */
  createdAt?: string;
  /** Last update time */
  updatedAt?: string;
  /** Primary key ID */
  id?: number;
  /** UUID */
  uuid?: string;
  /** Associated product ID */
  productId?: number;
  /** SKU code */
  skuCode?: string;
  /** SKU name */
  name?: string;
  /** SKU title */
  title?: string;
  /** SKU selling price */
  price?: number;
  /** Original price */
  originalPrice?: number;
  /** Current stock quantity */
  stock?: number;
  /** Total sales quantity */
  sales?: number;
  /** SKU status */
  status?: number;
  /** SKU image */
  image?: string;
  /** SKU specs */
  specs?: string;
}
