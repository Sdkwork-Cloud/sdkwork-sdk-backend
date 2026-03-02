import type { PageableObject } from './pageable-object';
import type { PlusUserVO } from './plus-user-vo';
import type { SortObject } from './sort-object';

export interface PagePlusUserVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusUserVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
