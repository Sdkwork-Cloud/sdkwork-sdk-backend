import type { PageableObject } from './pageable-object';
import type { PlusShopVO } from './plus-shop-vo';
import type { SortObject } from './sort-object';

export interface PagePlusShopVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusShopVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
