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
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
