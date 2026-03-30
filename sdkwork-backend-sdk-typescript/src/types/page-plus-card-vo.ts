import type { PageableObject } from './pageable-object';
import type { PlusCardVO } from './plus-card-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCardVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusCardVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
