import type { PageableObject } from './pageable-object';
import type { PlusPositionVO } from './plus-position-vo';
import type { SortObject } from './sort-object';

export interface PagePlusPositionVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusPositionVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
