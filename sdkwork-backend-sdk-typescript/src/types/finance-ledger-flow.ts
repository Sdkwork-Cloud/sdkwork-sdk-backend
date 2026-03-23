export interface FinanceLedgerFlow {
  id?: string;
  flowNo?: string;
  relatedOrderNo?: string;
  type?: string;
  direction?: string;
  amount?: number;
  balanceSnapshot?: number;
  subject?: string;
  subjectId?: string;
  channel?: string;
  remark?: string;
  createTime?: string;
}
