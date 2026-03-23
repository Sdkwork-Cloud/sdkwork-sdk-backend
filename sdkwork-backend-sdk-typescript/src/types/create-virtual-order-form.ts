import type { OrderContentItem } from './order-content-item';

/** Create virtual order form */
export interface CreateVirtualOrderForm {
  /** è®¢ååå®¹é¡¹åè¡¨ */
  items?: OrderContentItem[];
  /** èæååæææ */
  expireTime?: string;
}
