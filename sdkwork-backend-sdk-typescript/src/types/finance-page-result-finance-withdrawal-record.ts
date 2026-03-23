import type { FinanceWithdrawalRecord } from './finance-withdrawal-record';

export interface FinancePageResultFinanceWithdrawalRecord {
  list?: FinanceWithdrawalRecord[];
  total?: number;
  page?: number;
  pageSize?: number;
  totalPages?: number;
  size?: number;
}
