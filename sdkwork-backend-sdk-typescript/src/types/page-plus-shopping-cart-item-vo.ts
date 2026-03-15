import type { PageableObject } from './pageable-object';
import type { PlusShoppingCartItemVO } from './plus-shopping-cart-item-vo';
import type { SortObject } from './sort-object';

export interface PagePlusShoppingCartItemVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusShoppingCartItemVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
