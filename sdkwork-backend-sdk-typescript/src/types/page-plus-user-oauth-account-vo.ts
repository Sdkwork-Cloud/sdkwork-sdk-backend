import type { PageableObject } from './pageable-object';
import type { PlusUserOAuthAccountVO } from './plus-user-oauth-account-vo';
import type { SortObject } from './sort-object';

export interface PagePlusUserOAuthAccountVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusUserOAuthAccountVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
