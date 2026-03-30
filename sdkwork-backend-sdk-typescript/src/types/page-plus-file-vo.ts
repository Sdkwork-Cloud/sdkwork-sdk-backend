import type { PageableObject } from './pageable-object';
import type { PlusFileVO } from './plus-file-vo';
import type { SortObject } from './sort-object';

export interface PagePlusFileVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusFileVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
