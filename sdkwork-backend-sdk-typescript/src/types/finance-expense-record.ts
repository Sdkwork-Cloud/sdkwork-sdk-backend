import type { FinanceExpenseAuditLog } from './finance-expense-audit-log';

export interface FinanceExpenseRecord {
  id?: string;
  expenseNo?: string;
  type?: string;
  title?: string;
  amount?: number;
  beneficiary?: string;
  accountInfo?: string;
  applicant?: string;
  status?: string;
  createTime?: string;
  approveTime?: string;
  remark?: string;
  attachments?: string[];
  auditLogs?: FinanceExpenseAuditLog[];
}
