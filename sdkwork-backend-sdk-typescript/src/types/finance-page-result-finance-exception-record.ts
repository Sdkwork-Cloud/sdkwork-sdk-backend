import type { FinanceExceptionRecord } from './finance-exception-record';

export interface FinancePageResultFinanceExceptionRecord {
  list?: FinanceExceptionRecord[];
  total?: number;
  page?: number;
  pageSize?: number;
  totalPages?: number;
  size?: number;
}
