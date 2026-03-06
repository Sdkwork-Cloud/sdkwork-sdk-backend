import type { PageableObject } from './pageable-object';
import type { PlusDetailVO } from './plus-detail-vo';
import type { SortObject } from './sort-object';

export interface PagePlusDetailVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusDetailVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
