import type { PageableObject } from './pageable-object';
import type { PlusPermissionVO } from './plus-permission-vo';
import type { SortObject } from './sort-object';

export interface PagePlusPermissionVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusPermissionVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
