import type { FinanceReconciliationBill } from './finance-reconciliation-bill';

export interface FinancePageResultFinanceReconciliationBill {
  list?: FinanceReconciliationBill[];
  total?: number;
  page?: number;
  pageSize?: number;
  totalPages?: number;
  size?: number;
}
