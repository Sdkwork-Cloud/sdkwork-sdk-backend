import type { PageableObject } from './pageable-object';
import type { PlusDetailVO } from './plus-detail-vo';
import type { SortObject } from './sort-object';

export interface PagePlusDetailVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusDetailVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
