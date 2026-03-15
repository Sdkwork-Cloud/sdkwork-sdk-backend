import type { PageableObject } from './pageable-object';
import type { PlusRoleVO } from './plus-role-vo';
import type { SortObject } from './sort-object';

export interface PagePlusRoleVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusRoleVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
