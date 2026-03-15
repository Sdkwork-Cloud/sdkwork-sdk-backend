import type { PageableObject } from './pageable-object';
import type { PlusCollectionItemVO } from './plus-collection-item-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCollectionItemVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusCollectionItemVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
