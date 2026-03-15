import type { PageableObject } from './pageable-object';
import type { PlusAccountVO } from './plus-account-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAccountVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusAccountVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
