import type { OrderContentItem } from './order-content-item';

/** Create VIP order form */
export interface CreateVipOrderForm {
  /** 订单内容项列表 */
  items?: OrderContentItem[];
  /** 会员有效期 */
  expireTime?: string;
}
