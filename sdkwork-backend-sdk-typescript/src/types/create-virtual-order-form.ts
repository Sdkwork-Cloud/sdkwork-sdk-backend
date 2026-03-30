import type { OrderContentItem } from './order-content-item';

/** Create virtual order form */
export interface CreateVirtualOrderForm {
  /** 订单内容项列表 */
  items?: OrderContentItem[];
  /** 虚拟商品有效期 */
  expireTime?: string;
}
