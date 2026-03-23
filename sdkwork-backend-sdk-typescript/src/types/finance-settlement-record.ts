export interface FinanceSettlementRecord {
  id?: string;
  settlementNo?: string;
  period?: string;
  targetId?: string;
  targetName?: string;
  targetType?: string;
  totalOrderCount?: number;
  totalAmount?: number;
  commissionAmount?: number;
  status?: string;
  createTime?: string;
  settleTime?: string;
}
