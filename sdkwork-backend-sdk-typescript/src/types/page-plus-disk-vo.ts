import type { PageableObject } from './pageable-object';
import type { PlusDiskVO } from './plus-disk-vo';
import type { SortObject } from './sort-object';

export interface PagePlusDiskVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusDiskVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
