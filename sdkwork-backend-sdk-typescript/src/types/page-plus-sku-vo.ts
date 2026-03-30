import type { PageableObject } from './pageable-object';
import type { PlusSkuVO } from './plus-sku-vo';
import type { SortObject } from './sort-object';

export interface PagePlusSkuVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusSkuVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
