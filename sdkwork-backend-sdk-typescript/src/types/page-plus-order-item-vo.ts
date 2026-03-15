import type { PageableObject } from './pageable-object';
import type { PlusOrderItemVO } from './plus-order-item-vo';
import type { SortObject } from './sort-object';

export interface PagePlusOrderItemVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusOrderItemVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
