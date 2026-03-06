import type { PageableObject } from './pageable-object';
import type { PlusRefundVO } from './plus-refund-vo';
import type { SortObject } from './sort-object';

export interface PagePlusRefundVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusRefundVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
