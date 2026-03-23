import type { OrderContentItem } from './order-content-item';

/** Create booking order form */
export interface CreateBookingOrderForm {
  /** è®¢ååå®¹é¡¹åè¡¨ */
  items?: OrderContentItem[];
  /** é¢çº¦æææ */
  expireTime?: string;
}
