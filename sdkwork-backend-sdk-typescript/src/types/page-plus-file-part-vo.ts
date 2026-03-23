import type { PageableObject } from './pageable-object';
import type { PlusFilePartVO } from './plus-file-part-vo';
import type { SortObject } from './sort-object';

export interface PagePlusFilePartVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusFilePartVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
