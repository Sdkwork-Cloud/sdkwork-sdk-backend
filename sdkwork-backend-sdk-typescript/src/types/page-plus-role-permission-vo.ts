import type { PageableObject } from './pageable-object';
import type { PlusRolePermissionVO } from './plus-role-permission-vo';
import type { SortObject } from './sort-object';

export interface PagePlusRolePermissionVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusRolePermissionVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
