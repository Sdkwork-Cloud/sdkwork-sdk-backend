import type { PageableObject } from './pageable-object';
import type { PlusFeedsVO } from './plus-feeds-vo';
import type { SortObject } from './sort-object';

export interface PagePlusFeedsVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusFeedsVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
