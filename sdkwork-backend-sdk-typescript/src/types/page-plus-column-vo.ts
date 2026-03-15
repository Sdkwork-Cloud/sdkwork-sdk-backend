import type { PageableObject } from './pageable-object';
import type { PlusColumnVO } from './plus-column-vo';
import type { SortObject } from './sort-object';

export interface PagePlusColumnVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusColumnVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
