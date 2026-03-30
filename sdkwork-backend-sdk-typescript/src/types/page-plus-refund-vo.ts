import type { PageableObject } from './pageable-object';
import type { PlusRefundVO } from './plus-refund-vo';
import type { SortObject } from './sort-object';

export interface PagePlusRefundVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusRefundVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
