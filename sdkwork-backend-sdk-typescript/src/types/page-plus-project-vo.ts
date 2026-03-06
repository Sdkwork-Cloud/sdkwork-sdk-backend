import type { PageableObject } from './pageable-object';
import type { PlusProjectVO } from './plus-project-vo';
import type { SortObject } from './sort-object';

export interface PagePlusProjectVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusProjectVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
