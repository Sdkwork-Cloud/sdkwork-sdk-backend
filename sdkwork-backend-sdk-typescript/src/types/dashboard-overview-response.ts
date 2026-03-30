import type { DashboardExpenseSummary } from './dashboard-expense-summary';
import type { DashboardFinanceSummary } from './dashboard-finance-summary';
import type { DashboardRtcSummary } from './dashboard-rtc-summary';
import type { DashboardStorageSummary } from './dashboard-storage-summary';
import type { DashboardTimeWindows } from './dashboard-time-windows';
import type { DashboardTokenSummary } from './dashboard-token-summary';
import type { DashboardTrendPoint } from './dashboard-trend-point';
import type { DashboardWindowCounter } from './dashboard-window-counter';

export interface DashboardOverviewResponse {
  generatedAt?: string;
  timeWindows?: DashboardTimeWindows;
  orderSummary?: DashboardWindowCounter;
  tokenSummary?: DashboardTokenSummary;
  rtcSummary?: DashboardRtcSummary;
  storageSummary?: DashboardStorageSummary;
  expenseSummary?: DashboardExpenseSummary;
  financeSummary?: DashboardFinanceSummary;
  trends?: DashboardTrendPoint[];
}
