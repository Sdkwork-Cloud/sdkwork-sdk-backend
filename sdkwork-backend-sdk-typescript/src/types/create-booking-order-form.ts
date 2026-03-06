import type { OrderContentItem } from './order-content-item';

/** Create booking order form */
export interface CreateBookingOrderForm {
  /** 订单内容项列表 */
  items?: OrderContentItem[];
  /** 预约有效期 */
  expireTime?: string;
}
