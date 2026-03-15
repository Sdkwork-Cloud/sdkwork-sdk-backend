import type { PageableObject } from './pageable-object';
import type { PlusPositionVO } from './plus-position-vo';
import type { SortObject } from './sort-object';

export interface PagePlusPositionVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusPositionVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
