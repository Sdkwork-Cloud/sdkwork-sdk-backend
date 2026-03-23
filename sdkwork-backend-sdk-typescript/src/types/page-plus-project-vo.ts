import type { PageableObject } from './pageable-object';
import type { PlusProjectVO } from './plus-project-vo';
import type { SortObject } from './sort-object';

export interface PagePlusProjectVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusProjectVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
