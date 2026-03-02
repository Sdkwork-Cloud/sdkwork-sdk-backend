/** 购物车条目VO */
export interface PlusShoppingCartItemVO {
  /** 创建时间 */
  createdAt?: string;
  /** 最后更新时间 */
  updatedAt?: string;
  /** 主键ID */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 购物车ID */
  cartId?: number;
  /** 购物车分组UUID */
  cartGroupUuid?: string;
  /** 商品ID */
  productId?: number;
  /** SKU ID */
  skuId?: number;
  /** 商品数量 */
  quantity?: number;
  /** 加入购物车时的价格 */
  price?: number;
  /** 是否选中 */
  selected?: boolean;
}
