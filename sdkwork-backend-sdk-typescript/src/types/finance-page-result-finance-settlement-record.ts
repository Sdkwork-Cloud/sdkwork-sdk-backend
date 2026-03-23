import type { FinanceSettlementRecord } from './finance-settlement-record';

export interface FinancePageResultFinanceSettlementRecord {
  list?: FinanceSettlementRecord[];
  total?: number;
  page?: number;
  pageSize?: number;
  totalPages?: number;
  size?: number;
}
