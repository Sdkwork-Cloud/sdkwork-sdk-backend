import type { PageableObject } from './pageable-object';
import type { PlusRolePermissionVO } from './plus-role-permission-vo';
import type { SortObject } from './sort-object';

export interface PagePlusRolePermissionVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusRolePermissionVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
