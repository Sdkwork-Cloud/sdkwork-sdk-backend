/** Shopping cart item creation form */
export interface PlusShoppingCartItemForm {
  /** 购物车ID */
  cartId: number;
  /** 购物车分组UUID */
  cartGroupUuid: string;
  /** 商品ID */
  productId: number;
  /** SKU ID */
  skuId: number;
  /** 商品数量 */
  quantity: number;
  /** 加入购物车时的价格 */
  price: number;
  /** 是否选中 */
  selected: boolean;
}
