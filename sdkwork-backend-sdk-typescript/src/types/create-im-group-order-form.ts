import type { OrderContentItem } from './order-content-item';

/** Create IM group order form */
export interface CreateImGroupOrderForm {
  /** è®¢ååå®¹é¡¹åè¡¨ */
  items?: OrderContentItem[];
  /** æææ */
  expireTime?: string;
}
