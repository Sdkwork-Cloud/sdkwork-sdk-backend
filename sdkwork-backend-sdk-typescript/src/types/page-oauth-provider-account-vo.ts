import type { OAuthProviderAccountVO } from './oauth-provider-account-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageOAuthProviderAccountVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: OAuthProviderAccountVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
