import type { PageableObject } from './pageable-object';
import type { PlusFilePartVO } from './plus-file-part-vo';
import type { SortObject } from './sort-object';

export interface PagePlusFilePartVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusFilePartVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
