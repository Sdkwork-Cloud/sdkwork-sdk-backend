import type { PageableObject } from './pageable-object';
import type { PlusImageVO } from './plus-image-vo';
import type { SortObject } from './sort-object';

export interface PagePlusImageVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusImageVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
