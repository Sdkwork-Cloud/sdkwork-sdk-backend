import type { PageableObject } from './pageable-object';
import type { PlusImGroupVO } from './plus-im-group-vo';
import type { SortObject } from './sort-object';

export interface PagePlusImGroupVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusImGroupVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
