import type { PageableObject } from './pageable-object';
import type { PlusAccountVO } from './plus-account-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAccountVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusAccountVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
