import type { FinanceLedgerFlow } from './finance-ledger-flow';

export interface FinancePageResultFinanceLedgerFlow {
  list?: FinanceLedgerFlow[];
  total?: number;
  page?: number;
  pageSize?: number;
  totalPages?: number;
  size?: number;
}
