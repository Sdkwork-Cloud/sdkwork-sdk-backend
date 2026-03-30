import type { PlusChannelVO } from './plus-channel-vo';

/** API调用结果 */
export interface PlusApiResultListPlusChannelVO {
  /** Response data */
  data: PlusChannelVO[];
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
