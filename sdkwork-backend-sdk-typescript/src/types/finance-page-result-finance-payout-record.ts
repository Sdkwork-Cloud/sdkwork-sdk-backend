import type { FinancePayoutRecord } from './finance-payout-record';

export interface FinancePageResultFinancePayoutRecord {
  list?: FinancePayoutRecord[];
  total?: number;
  page?: number;
  pageSize?: number;
  totalPages?: number;
  size?: number;
}
