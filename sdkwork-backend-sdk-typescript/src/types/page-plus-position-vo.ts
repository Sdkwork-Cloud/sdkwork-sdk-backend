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
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
