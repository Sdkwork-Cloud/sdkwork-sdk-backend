import type { FinanceTrendItem } from './finance-trend-item';

export interface FinanceOverviewResponse {
  todayGmv?: number;
  monthGmv?: number;
  platformIncome?: number;
  pendingSettlement?: number;
  pendingWithdrawal?: number;
  abnormalCount?: number;
  totalInvoices?: number;
  trend?: FinanceTrendItem[];
}
