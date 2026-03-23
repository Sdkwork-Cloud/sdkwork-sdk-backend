import type { FinanceExpenseRecord } from './finance-expense-record';

export interface FinancePageResultFinanceExpenseRecord {
  list?: FinanceExpenseRecord[];
  total?: number;
  page?: number;
  pageSize?: number;
  totalPages?: number;
  size?: number;
}
