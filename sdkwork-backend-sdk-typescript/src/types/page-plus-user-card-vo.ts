import type { PageableObject } from './pageable-object';
import type { PlusUserCardVO } from './plus-user-card-vo';
import type { SortObject } from './sort-object';

export interface PagePlusUserCardVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusUserCardVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
