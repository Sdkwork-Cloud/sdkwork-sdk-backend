import type { PageableObject } from './pageable-object';
import type { PlusFileContentVO } from './plus-file-content-vo';
import type { SortObject } from './sort-object';

export interface PagePlusFileContentVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusFileContentVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
