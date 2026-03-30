import type { PageableObject } from './pageable-object';
import type { PlusColumnVO } from './plus-column-vo';
import type { SortObject } from './sort-object';

export interface PagePlusColumnVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusColumnVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
