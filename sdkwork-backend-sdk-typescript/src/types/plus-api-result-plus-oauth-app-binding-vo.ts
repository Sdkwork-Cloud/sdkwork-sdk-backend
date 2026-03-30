import type { PlusOAuthAppBindingVO } from './plus-oauth-app-binding-vo';

/** API调用结果 */
export interface PlusApiResultPlusOAuthAppBindingVO {
  /** Response data */
  data: PlusOAuthAppBindingVO;
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
