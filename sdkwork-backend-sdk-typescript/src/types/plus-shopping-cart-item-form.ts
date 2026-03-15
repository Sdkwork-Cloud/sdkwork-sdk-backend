/** Shopping cart item creation form */
export interface PlusShoppingCartItemForm {
  /** 璐墿杞D */
  cartId: number;
  /** 璐墿杞﹀垎缁刄UID */
  cartGroupUuid: string;
  /** 鍟嗗搧ID */
  productId: number;
  /** SKU ID */
  skuId: number;
  /** 鍟嗗搧鏁伴噺 */
  quantity: number;
  /** P ri ce */
  price: number;
  /** 鏄惁閫変腑 */
  selected: boolean;
}
