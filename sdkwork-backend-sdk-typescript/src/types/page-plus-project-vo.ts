import type { PageableObject } from './pageable-object';
import type { PlusProjectVO } from './plus-project-vo';
import type { SortObject } from './sort-object';

export interface PagePlusProjectVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusProjectVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
