import type { PageableObject } from './pageable-object';
import type { PlusOrderItemVO } from './plus-order-item-vo';
import type { SortObject } from './sort-object';

export interface PagePlusOrderItemVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusOrderItemVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
