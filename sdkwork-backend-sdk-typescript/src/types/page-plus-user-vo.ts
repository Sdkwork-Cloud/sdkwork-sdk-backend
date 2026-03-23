import type { PageableObject } from './pageable-object';
import type { PlusUserVO } from './plus-user-vo';
import type { SortObject } from './sort-object';

export interface PagePlusUserVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusUserVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
