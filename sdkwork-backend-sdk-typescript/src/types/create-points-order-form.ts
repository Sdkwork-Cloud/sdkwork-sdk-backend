import type { OrderContentItem } from './order-content-item';

/** Create points order form */
export interface CreatePointsOrderForm {
  /** è®¢ååå®¹é¡¹åè¡¨ */
  items?: OrderContentItem[];
  /** ç§¯åæ°é */
  pointsAmount?: number;
  /** ç§¯åæææ */
  expireTime?: string;
}
