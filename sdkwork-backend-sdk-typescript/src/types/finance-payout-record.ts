export interface FinancePayoutRecord {
  id?: string;
  payoutNo?: string;
  sourceNo?: string;
  recipientName?: string;
  recipientAccount?: string;
  amount?: number;
  channel?: string;
  status?: string;
  failReason?: string;
  createTime?: string;
  finishTime?: string;
}
