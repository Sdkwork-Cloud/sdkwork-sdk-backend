import type { PageableObject } from './pageable-object';
import type { PlusImageVO } from './plus-image-vo';
import type { SortObject } from './sort-object';

export interface PagePlusImageVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusImageVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
