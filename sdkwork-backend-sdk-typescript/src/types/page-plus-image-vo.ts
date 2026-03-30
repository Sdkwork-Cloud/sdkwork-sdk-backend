import type { PageableObject } from './pageable-object';
import type { PlusImageVO } from './plus-image-vo';
import type { SortObject } from './sort-object';

export interface PagePlusImageVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusImageVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
