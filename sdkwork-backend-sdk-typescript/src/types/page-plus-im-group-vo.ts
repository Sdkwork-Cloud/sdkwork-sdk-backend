import type { PageableObject } from './pageable-object';
import type { PlusImGroupVO } from './plus-im-group-vo';
import type { SortObject } from './sort-object';

export interface PagePlusImGroupVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusImGroupVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
