import type { PageableObject } from './pageable-object';
import type { PlusFeedsVO } from './plus-feeds-vo';
import type { SortObject } from './sort-object';

export interface PagePlusFeedsVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusFeedsVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
