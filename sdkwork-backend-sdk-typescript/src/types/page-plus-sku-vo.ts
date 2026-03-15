import type { PageableObject } from './pageable-object';
import type { PlusSkuVO } from './plus-sku-vo';
import type { SortObject } from './sort-object';

export interface PagePlusSkuVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusSkuVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
