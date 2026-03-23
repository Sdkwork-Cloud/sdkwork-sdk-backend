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
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
