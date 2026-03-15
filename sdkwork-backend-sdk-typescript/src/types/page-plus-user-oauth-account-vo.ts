import type { PageableObject } from './pageable-object';
import type { PlusUserOAuthAccountVO } from './plus-user-oauth-account-vo';
import type { SortObject } from './sort-object';

export interface PagePlusUserOAuthAccountVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusUserOAuthAccountVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
