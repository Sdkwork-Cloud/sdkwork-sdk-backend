import type { PageableObject } from './pageable-object';
import type { PlusCollectionVO } from './plus-collection-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCollectionVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusCollectionVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
