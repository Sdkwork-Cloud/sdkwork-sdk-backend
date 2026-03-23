export interface FinanceWithdrawalRecord {
  id?: string;
  applyNo?: string;
  userId?: string;
  userName?: string;
  userType?: string;
  amount?: number;
  fee?: number;
  actualAmount?: number;
  accountType?: string;
  accountInfo?: string;
  status?: string;
  riskLevel?: string;
  auditTime?: string;
  auditor?: string;
  payoutTime?: string;
  createTime?: string;
  remark?: string;
}
