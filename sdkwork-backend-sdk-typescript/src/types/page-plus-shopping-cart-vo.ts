import type { PageableObject } from './pageable-object';
import type { PlusShoppingCartVO } from './plus-shopping-cart-vo';
import type { SortObject } from './sort-object';

export interface PagePlusShoppingCartVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusShoppingCartVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
