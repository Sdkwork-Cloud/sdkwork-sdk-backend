import type { PageableObject } from './pageable-object';
import type { PlusShareVO } from './plus-share-vo';
import type { SortObject } from './sort-object';

export interface PagePlusShareVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusShareVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
