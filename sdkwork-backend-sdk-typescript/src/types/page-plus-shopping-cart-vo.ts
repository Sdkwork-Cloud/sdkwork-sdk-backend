import type { PageableObject } from './pageable-object';
import type { PlusShoppingCartVO } from './plus-shopping-cart-vo';
import type { SortObject } from './sort-object';

export interface PagePlusShoppingCartVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusShoppingCartVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
