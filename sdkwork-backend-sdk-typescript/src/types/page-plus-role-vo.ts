import type { PageableObject } from './pageable-object';
import type { PlusRoleVO } from './plus-role-vo';
import type { SortObject } from './sort-object';

export interface PagePlusRoleVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusRoleVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
