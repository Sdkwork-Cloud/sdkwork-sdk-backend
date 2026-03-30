import type { PageOAuthProviderAccountVO } from './page-oauth-provider-account-vo';

/** API调用结果 */
export interface PlusApiResultPageOAuthProviderAccountVO {
  /** Response data */
  data: PageOAuthProviderAccountVO;
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
