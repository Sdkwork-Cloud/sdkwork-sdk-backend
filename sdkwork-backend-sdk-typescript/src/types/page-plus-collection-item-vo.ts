import type { PageableObject } from './pageable-object';
import type { PlusCollectionItemVO } from './plus-collection-item-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCollectionItemVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusCollectionItemVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
