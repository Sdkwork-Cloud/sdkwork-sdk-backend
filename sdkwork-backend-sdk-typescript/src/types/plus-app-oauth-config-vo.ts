import type { PlusAppOAuthBindingVO } from './plus-app-oauth-binding-vo';
import type { PlusAppOAuthProviderAccountVO } from './plus-app-oauth-provider-account-vo';
import type { PlusAppOAuthSummaryVO } from './plus-app-oauth-summary-vo';

/** Plus app oauth configuration */
export interface PlusAppOAuthConfigVO {
  /** App id */
  appId?: number;
  /** App name */
  appName?: string;
  /** App oauth bindings */
  bindings?: PlusAppOAuthBindingVO[];
  /** Available oauth provider accounts in current app scope */
  providerAccounts?: PlusAppOAuthProviderAccountVO[];
  /** App oauth summary */
  summary?: PlusAppOAuthSummaryVO;
}
