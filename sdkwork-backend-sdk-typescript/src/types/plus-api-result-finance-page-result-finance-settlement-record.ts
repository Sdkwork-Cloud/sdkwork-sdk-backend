import type { FinancePageResultFinanceSettlementRecord } from './finance-page-result-finance-settlement-record';

/** API调用结果 */
export interface PlusApiResultFinancePageResultFinanceSettlementRecord {
  /** Response data */
  data: FinancePageResultFinanceSettlementRecord;
  /** Response code: 2000=success, 4xxx=business failure, 5xxx=server error */
  code: string;
  /** Business message */
  msg: string;
  /** Request identifier */
  requestId: string;
  /** Client IP address */
  ip?: string;
  /** Server hostname */
  hostname?: string;
  /** Business error name */
  errorName: string;
}
