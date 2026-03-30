import type { PlusRefundVO } from './plus-refund-vo';

/** API调用结果 */
export interface PlusApiResultPlusRefundVO {
  /** Response data */
  data: PlusRefundVO;
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
