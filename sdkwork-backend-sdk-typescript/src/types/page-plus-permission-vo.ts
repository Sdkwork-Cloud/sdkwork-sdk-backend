import type { PageableObject } from './pageable-object';
import type { PlusPermissionVO } from './plus-permission-vo';
import type { SortObject } from './sort-object';

export interface PagePlusPermissionVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusPermissionVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
