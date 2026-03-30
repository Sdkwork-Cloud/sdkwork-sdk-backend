import type { PageableObject } from './pageable-object';
import type { PlusOrderItemVO } from './plus-order-item-vo';
import type { SortObject } from './sort-object';

export interface PagePlusOrderItemVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusOrderItemVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
