import type { PageableObject } from './pageable-object';
import type { PlusShoppingCartItemVO } from './plus-shopping-cart-item-vo';
import type { SortObject } from './sort-object';

export interface PagePlusShoppingCartItemVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusShoppingCartItemVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
