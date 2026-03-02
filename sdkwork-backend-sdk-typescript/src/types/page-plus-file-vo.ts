import type { PageableObject } from './pageable-object';
import type { PlusFileVO } from './plus-file-vo';
import type { SortObject } from './sort-object';

export interface PagePlusFileVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusFileVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
