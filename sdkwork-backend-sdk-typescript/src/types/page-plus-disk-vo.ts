import type { PageableObject } from './pageable-object';
import type { PlusDiskVO } from './plus-disk-vo';
import type { SortObject } from './sort-object';

export interface PagePlusDiskVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusDiskVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
