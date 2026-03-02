import type { PageableObject } from './pageable-object';
import type { PlusRolePermissionVO } from './plus-role-permission-vo';
import type { SortObject } from './sort-object';

export interface PagePlusRolePermissionVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusRolePermissionVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
