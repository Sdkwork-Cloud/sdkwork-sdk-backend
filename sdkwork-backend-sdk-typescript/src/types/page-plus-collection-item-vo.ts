import type { PageableObject } from './pageable-object';
import type { PlusCollectionItemVO } from './plus-collection-item-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCollectionItemVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusCollectionItemVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
