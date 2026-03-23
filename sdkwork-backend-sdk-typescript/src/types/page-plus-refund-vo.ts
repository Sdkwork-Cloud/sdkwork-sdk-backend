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
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
