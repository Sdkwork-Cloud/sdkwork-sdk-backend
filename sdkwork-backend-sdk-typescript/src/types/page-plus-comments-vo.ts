import type { PageableObject } from './pageable-object';
import type { PlusCommentsVO } from './plus-comments-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCommentsVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusCommentsVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
