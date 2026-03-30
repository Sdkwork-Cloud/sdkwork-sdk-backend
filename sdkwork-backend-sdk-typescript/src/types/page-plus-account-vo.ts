import type { PageableObject } from './pageable-object';
import type { PlusAccountVO } from './plus-account-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAccountVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusAccountVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
