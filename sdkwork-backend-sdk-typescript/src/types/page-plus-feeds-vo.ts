import type { PageableObject } from './pageable-object';
import type { PlusFeedsVO } from './plus-feeds-vo';
import type { SortObject } from './sort-object';

export interface PagePlusFeedsVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusFeedsVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
