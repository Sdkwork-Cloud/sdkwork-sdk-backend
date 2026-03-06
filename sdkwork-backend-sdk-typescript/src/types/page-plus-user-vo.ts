import type { PageableObject } from './pageable-object';
import type { PlusUserVO } from './plus-user-vo';
import type { SortObject } from './sort-object';

export interface PagePlusUserVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusUserVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
