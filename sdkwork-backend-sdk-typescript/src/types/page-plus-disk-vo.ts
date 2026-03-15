import type { PageableObject } from './pageable-object';
import type { PlusDiskVO } from './plus-disk-vo';
import type { SortObject } from './sort-object';

export interface PagePlusDiskVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusDiskVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
