import type { PageableObject } from './pageable-object';
import type { PlusPositionVO } from './plus-position-vo';
import type { SortObject } from './sort-object';

export interface PagePlusPositionVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusPositionVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
