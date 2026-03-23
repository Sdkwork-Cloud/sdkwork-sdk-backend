export interface FinanceExpenseCreateRequest {
  type?: string;
  title?: string;
  amount?: number;
  beneficiary?: string;
  accountInfo?: string;
  remark?: string;
  attachments?: string[];
}
