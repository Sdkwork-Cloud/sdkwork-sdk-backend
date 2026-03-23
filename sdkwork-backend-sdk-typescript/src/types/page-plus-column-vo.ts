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
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
