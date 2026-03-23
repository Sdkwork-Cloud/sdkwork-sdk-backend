import type { OrderContentItem } from './order-content-item';

/** Create VIP order form */
export interface CreateVipOrderForm {
  /** è®¢ååå®¹é¡¹åè¡¨ */
  items?: OrderContentItem[];
  /** ä¼åæææ */
  expireTime?: string;
}
