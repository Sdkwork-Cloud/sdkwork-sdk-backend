import type { PageableObject } from './pageable-object';
import type { PlusCollectionVO } from './plus-collection-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCollectionVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusCollectionVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
