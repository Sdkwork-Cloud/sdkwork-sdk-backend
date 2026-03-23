/** è´­ç©è½¦æ¡ç®VO */
export interface PlusShoppingCartItemVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** è´­ç©è½¦ID */
  cartId?: number;
  /** è´­ç©è½¦åç»UUID */
  cartGroupUuid?: string;
  /** ååID */
  productId?: number;
  /** SKU ID */
  skuId?: number;
  /** ååæ°é */
  quantity?: number;
  /** å å¥è´­ç©è½¦æ¶çä»·æ ¼ */
  price?: number;
  /** æ¯å¦éä¸­ */
  selected?: boolean;
}
