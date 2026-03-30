import type { OrderContentItem } from './order-content-item';

/** Create IM group order form */
export interface CreateImGroupOrderForm {
  /** 订单内容项列表 */
  items?: OrderContentItem[];
  /** 有效期 */
  expireTime?: string;
}
