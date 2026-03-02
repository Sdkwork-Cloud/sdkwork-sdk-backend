import type { PageableObject } from './pageable-object';
import type { PlusFileContentVO } from './plus-file-content-vo';
import type { SortObject } from './sort-object';

export interface PagePlusFileContentVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusFileContentVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
