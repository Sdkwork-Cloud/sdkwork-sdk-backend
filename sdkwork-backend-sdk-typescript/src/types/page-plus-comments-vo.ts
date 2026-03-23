import type { PageableObject } from './pageable-object';
import type { PlusCommentsVO } from './plus-comments-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCommentsVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusCommentsVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
