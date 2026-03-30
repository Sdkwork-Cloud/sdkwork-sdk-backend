import type { OAuthProviderAccountImpactBindingVO } from './oauth-provider-account-impact-binding-vo';

/** OAuth provider account impact view object */
export interface OAuthProviderAccountImpactVO {
  /** Provider account id */
  providerAccountId?: number;
  /** Provider account name */
  providerAccountName?: string;
  /** Binding count */
  bindingCount?: number;
  /** Enabled binding count */
  enabledBindingCount?: number;
  /** Affected bindings */
  bindings?: OAuthProviderAccountImpactBindingVO[];
}
