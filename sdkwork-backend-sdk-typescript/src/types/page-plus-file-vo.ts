import type { PageableObject } from './pageable-object';
import type { PlusFileVO } from './plus-file-vo';
import type { SortObject } from './sort-object';

export interface PagePlusFileVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusFileVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
