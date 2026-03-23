import type { PageableObject } from './pageable-object';
import type { PlusShareVO } from './plus-share-vo';
import type { SortObject } from './sort-object';

export interface PagePlusShareVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusShareVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
