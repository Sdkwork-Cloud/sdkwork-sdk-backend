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
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
