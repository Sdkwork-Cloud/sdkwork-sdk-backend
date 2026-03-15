import type { PageableObject } from './pageable-object';
import type { PlusUserRoleVO } from './plus-user-role-vo';
import type { SortObject } from './sort-object';

export interface PagePlusUserRoleVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusUserRoleVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
