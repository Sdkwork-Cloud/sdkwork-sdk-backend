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
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
