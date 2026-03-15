import type { PageableObject } from './pageable-object';
import type { PlusShopVO } from './plus-shop-vo';
import type { SortObject } from './sort-object';

export interface PagePlusShopVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusShopVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
