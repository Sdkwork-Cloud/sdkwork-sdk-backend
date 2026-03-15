import type { PageableObject } from './pageable-object';
import type { PlusCardVO } from './plus-card-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCardVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusCardVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
