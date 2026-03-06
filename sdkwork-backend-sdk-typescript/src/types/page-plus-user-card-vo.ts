import type { PageableObject } from './pageable-object';
import type { PlusUserCardVO } from './plus-user-card-vo';
import type { SortObject } from './sort-object';

export interface PagePlusUserCardVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusUserCardVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
