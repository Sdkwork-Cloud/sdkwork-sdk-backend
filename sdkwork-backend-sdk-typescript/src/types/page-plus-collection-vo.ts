import type { PageableObject } from './pageable-object';
import type { PlusCollectionVO } from './plus-collection-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCollectionVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusCollectionVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
