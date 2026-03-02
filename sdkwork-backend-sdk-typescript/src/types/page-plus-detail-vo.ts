import type { PageableObject } from './pageable-object';
import type { PlusDetailVO } from './plus-detail-vo';
import type { SortObject } from './sort-object';

export interface PagePlusDetailVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusDetailVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
