import type { PageableObject } from './pageable-object';
import type { PlusUserOAuthAccountVO } from './plus-user-oauth-account-vo';
import type { SortObject } from './sort-object';

export interface PagePlusUserOAuthAccountVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusUserOAuthAccountVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
