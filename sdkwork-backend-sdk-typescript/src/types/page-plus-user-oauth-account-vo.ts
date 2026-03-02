import type { PageableObject } from './pageable-object';
import type { PlusUserOAuthAccountVO } from './plus-user-oauth-account-vo';
import type { SortObject } from './sort-object';

export interface PagePlusUserOAuthAccountVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusUserOAuthAccountVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
