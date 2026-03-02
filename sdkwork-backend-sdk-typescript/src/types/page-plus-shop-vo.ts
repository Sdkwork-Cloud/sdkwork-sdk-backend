import type { PageableObject } from './pageable-object';
import type { PlusShopVO } from './plus-shop-vo';
import type { SortObject } from './sort-object';

export interface PagePlusShopVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusShopVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
