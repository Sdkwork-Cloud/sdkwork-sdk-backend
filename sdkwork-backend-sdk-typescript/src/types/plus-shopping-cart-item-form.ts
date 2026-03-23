/** Shopping cart item creation form */
export interface PlusShoppingCartItemForm {
  /** çî å¢¿æî¯D */
  cartId: number;
  /** çî å¢¿æï¹åç¼åUID */
  cartGroupUuid: string;
  /** éåæ§ID */
  productId: number;
  /** SKU ID */
  skuId: number;
  /** éåæ§éä¼´åº */
  quantity: number;
  /** P ri ce */
  price: number;
  /** éîæé«å¤è */
  selected: boolean;
}
