export interface FinanceRiskProfileResponse {
  totalWithdrawals?: number;
  totalAmount?: number;
  lastWithdrawal?: string;
  riskScore?: number;
  abnormalTags?: string[];
}
