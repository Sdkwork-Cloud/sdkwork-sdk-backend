import type { PageableObject } from './pageable-object';
import type { PlusDetailVO } from './plus-detail-vo';
import type { SortObject } from './sort-object';

export interface PagePlusDetailVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusDetailVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
