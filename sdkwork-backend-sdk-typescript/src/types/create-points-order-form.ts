import type { OrderContentItem } from './order-content-item';

/** Create points order form */
export interface CreatePointsOrderForm {
  /** 订单内容项列表 */
  items?: OrderContentItem[];
  /** 积分数量 */
  pointsAmount?: number;
  /** 积分有效期 */
  expireTime?: string;
}
