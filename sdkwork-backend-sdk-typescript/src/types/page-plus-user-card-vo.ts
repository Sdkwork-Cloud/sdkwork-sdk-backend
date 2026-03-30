import type { PageableObject } from './pageable-object';
import type { PlusUserCardVO } from './plus-user-card-vo';
import type { SortObject } from './sort-object';

export interface PagePlusUserCardVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusUserCardVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
