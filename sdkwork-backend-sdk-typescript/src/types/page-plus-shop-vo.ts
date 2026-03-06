import type { PageableObject } from './pageable-object';
import type { PlusShopVO } from './plus-shop-vo';
import type { SortObject } from './sort-object';

export interface PagePlusShopVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusShopVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
