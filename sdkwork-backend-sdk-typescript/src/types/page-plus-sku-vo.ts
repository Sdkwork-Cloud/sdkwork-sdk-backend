import type { PageableObject } from './pageable-object';
import type { PlusSkuVO } from './plus-sku-vo';
import type { SortObject } from './sort-object';

export interface PagePlusSkuVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusSkuVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
