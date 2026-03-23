import type { FinanceRiskControlConfig } from './finance-risk-control-config';

export interface FinanceConfigRecord {
  minWithdrawal?: number;
  withdrawalFeeRate?: number;
  withdrawalFeeFixed?: number;
  autoPayoutLimit?: number;
  settlementCycle?: string;
  riskControl?: FinanceRiskControlConfig;
  largeWithdrawalNotify?: boolean;
  exceptionNotify?: boolean;
}
