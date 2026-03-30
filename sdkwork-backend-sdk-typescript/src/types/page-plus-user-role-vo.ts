import type { PageableObject } from './pageable-object';
import type { PlusUserRoleVO } from './plus-user-role-vo';
import type { SortObject } from './sort-object';

export interface PagePlusUserRoleVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusUserRoleVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
