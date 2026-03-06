import type { PageableObject } from './pageable-object';
import type { PlusSkuVO } from './plus-sku-vo';
import type { SortObject } from './sort-object';

export interface PagePlusSkuVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusSkuVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
