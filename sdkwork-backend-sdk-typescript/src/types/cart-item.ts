import type { PlusSku } from './plus-sku';

/** 购物车项目信息 */
export interface CartItem {
  /** 购物车项目ID */
  id?: number;
  /** 关联的SKU信息 */
  sku?: PlusSku;
  /** 商品数量 */
  quantity?: number;
  /** 商品单价 */
  unitPrice?: number;
  /** 商品总价 */
  totalPrice?: number;
  /** 是否选中 */
  selected?: boolean;
}
