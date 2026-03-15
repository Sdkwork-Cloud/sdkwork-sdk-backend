import type { PageableObject } from './pageable-object';
import type { PlusProjectVO } from './plus-project-vo';
import type { SortObject } from './sort-object';

export interface PagePlusProjectVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusProjectVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
