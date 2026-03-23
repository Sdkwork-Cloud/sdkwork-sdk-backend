export interface FinanceReconciliationBill {
  id?: string;
  date?: string;
  channel?: string;
  totalOrders?: number;
  platformAmount?: number;
  channelAmount?: number;
  diffAmount?: number;
  status?: string;
  diffOrdersCount?: number;
  createTime?: string;
}
